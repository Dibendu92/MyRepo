package MavenProject.FirstMavenProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file=new FileInputStream("D:\\Selenium-Udemy\\FirstMavenProject\\testData.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet= workBook.getSheet("Sheet1");
		Iterator<Row> rows=sheet.iterator();
		rows.next();
	}

}
