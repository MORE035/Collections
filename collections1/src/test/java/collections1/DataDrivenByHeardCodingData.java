package collections1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenByHeardCodingData {
	@Test(dataProvider = "Data1")
	public void extracData(String Name, String pass) {
		System.out.println(Name + "     " + pass);

	}

	public String getStringdata(String FileName, String SheetName, int RowNumb, int colmnNum) throws IOException {

		FileInputStream fi = new FileInputStream(FileName);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet sh = wb.getSheet(SheetName);
		int lastrow = sh.getLastRowNum();

		System.out.println(lastrow);
		System.out.println(sh);
		Row row = sh.getRow(RowNumb);
		Cell cell = row.getCell(colmnNum);
		String value1 = cell.getStringCellValue();
		wb.close();
		fi.close();
		return value1;
	}

	@DataProvider(name = "Data1")
	public Object[][] Dataprovide() throws IOException {

		DataDrivenByHeardCodingData DDH = new DataDrivenByHeardCodingData();

		Object[][] obj = new Object[2][2];
		obj[0][0] = DDH.getStringdata("C:\\Users\\SPURGE\\Desktop\\GRhombus\\Collections\\Data1.xlsx", "Data", 0, 0);

		obj[1][0] = DDH.getStringdata("C:\\Users\\SPURGE\\Desktop\\GRhombus\\Collections\\Data1.xlsx", "Data", 1, 1);

		return obj;

	}
}
