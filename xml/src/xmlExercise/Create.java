package xmlExercise;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class Create {
	
	

	
		public static File savesCarsListToXmlFile( List<Car> cars){
			ArrayList<Car> carsList =new ArrayList<>(cars);
		
			// root element
			Element rootCarsElement = new Element("cars");
			Document doc = new Document(rootCarsElement);

			
			for (int i = 0; i < carsList.size(); i++) {
				Element carElement = new Element("car");
				
				
				Element manufacturer = new Element("manufacturer");
				manufacturer.setText(carsList.get(i).getManufacturer());
				carElement.addContent(manufacturer);
				
				Element model = new Element("model");
				model.setText(carsList.get(i).getModel());
				carElement.addContent(model);
				
				Element year = new Element("year");
				year.setText(carsList.get(i).getYear());
				carElement.addContent(year);
				
				
				Element LicencePlate = new Element("LicencePlate");
				
				Element plateNumber = new Element("plateNumber");
				plateNumber.setAttribute(new Attribute("unique", "true" ));
				plateNumber.setText(String.valueOf(carsList.get(i).getLicencePlate().getPlateNumber()));
				LicencePlate.addContent(plateNumber);
				
				
				Element color = new Element("color");
				color.setText(carsList.get(i).getLicencePlate().getColor());
				LicencePlate.addContent(color);
				
				carElement.addContent(LicencePlate);
				doc.getRootElement().addContent(carElement);
			}
			
			try {
				XMLOutputter xmlOutput = new XMLOutputter();
				// display format
				xmlOutput.setFormat(Format.getPrettyFormat());
				// save to a file
				File outputFile = new File("myFiles/NewFile.xml");
				OutputStream outputStream = new FileOutputStream(outputFile);
				xmlOutput.output(doc, outputStream);
				return outputFile;
				
			}catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
	
	
	
		public static List parsesFileReturnList(File inputFile) {
			List<Car> cars= new ArrayList<Car>();
			
			try {
				SAXBuilder saxBuilder = new SAXBuilder();
				Document document = saxBuilder.build(inputFile);
				System.out.println("Root element :" + document.getRootElement().getName());
				Element classElement = document.getRootElement();
				
				List<Element> carsList = classElement.getChildren();
				
				for (int i = 0; i < carsList.size(); i++) {
					Element car = carsList.get(i);
					Car tmp = parseStudent(car);
					cars.add(tmp);
				}
				
			}catch (JDOMException e) {
				e.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			
			return cars;
		}
		
		
		private static Car parseStudent(Element car) {
			
			String manufacturer = car.getChild("manufacturer").getText();
			String model = car.getChild("model").getText();
			String year = car.getChild("year").getText();
			int plateNumber = Integer.parseInt(car.getChild("LicencePlate").getChild("plateNumber").getText());
			String color = car.getChild("LicencePlate").getChild("color").getText();;

			return new Car(manufacturer, model, year, new LicencePlate(color));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
}
