package miniproject;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.lang.Iterable;
import javax.swing.JFrame;

public class ExcelTest
{

    JFrame j = new JFrame();
   
    
    ExcelTest()
    {
       
      /*  ExcelFile workbook = ExcelFile.load("input.xlsx");
        ExcelWorksheet worksheet = workbook.getWorksheet(0);

        int rowsCount = worksheet.getRows().size();
        int columnsCount = worksheet.calculateMaxUsedColumns();

        String[][] rowData = new String[rowsCount][columnsCount];
        String[] columnNames = new String[columnsCount];

        for (int row = 0; row < rowsCount; row++) 
        {
            for (int column = 0; column < columnsCount; column++) 
            {

                ExcelCell cell = worksheet.getCell(row, column);
                String value = cell.getValue().toString();
                if (row == 0)
                columnNames[column] = value;
                else
                rowData[row - 1][column] = value;

            }
        }
*/
        //JTable table = new JTable(rowData, columnNames);
        //table.setBounds(400,400,400,400);
        //j.add(table);
        j.setSize(500, 500);
        j.setVisible(true);
        j.setLayout(null);

    }   
    public class main
    {
        public static void main(String[] args)
        {
            new ExcelTest();
        }
    }
}
