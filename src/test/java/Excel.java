import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    File file=new File("C:\\Users\\DELL\\Desktop\\TestData.xlsx");
    FileInputStream fl=new FileInputStream(file);
    XSSFWorkbook workbook=new XSSFWorkbook(fl);
    
    XSSFSheet sheet=workbook.getSheetAt(0);
    System.out.println(sheet.getRow(1).getCell(1));
	}

}
