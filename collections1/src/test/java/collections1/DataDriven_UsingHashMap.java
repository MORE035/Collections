package collections1;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven_UsingHashMap
{
	@Test(dataProvider = "data")
	public void data1(Map<Object, Object>map) {
		System.out.println(map.get("UserName"));
		System.out.println(map.get("Password"));
		System.out.println(map.get("DOB"));

		
		
	}
	@DataProvider(name = "data")
	public Object[][] dataprovider() throws IOException {
		
		FileInputStream fi=new FileInputStream("C:\\\\Users\\\\SPURGE\\\\Desktop\\\\GRhombus\\\\Collections\\\\Data1.xlsx");
	//	FileOutputStream fo=new FileOutputStream("dataProvider1Data.xlsx");
		Workbook wb=new XSSFWorkbook(fi);
		Sheet Data1Sheet = wb.getSheet("Data");
		int lastrow = Data1Sheet.getLastRowNum();
		short lastcell = Data1Sheet.getRow(0).getLastCellNum();
		Object[][] obj=new Object[lastrow][1];
		for(int i=0;i<lastrow;i++) {
		Map<Object , Object> HM=new HashedMap<Object , Object>();
		for (int j = 0; j < lastcell; j++) {
			
			HM.put(Data1Sheet.getRow(0).getCell(j).toString(),Data1Sheet.getRow(i+1).getCell(j).toString());
		}
		obj[i][0]=HM;
		}
		wb.close();

		return obj;
	}
}
