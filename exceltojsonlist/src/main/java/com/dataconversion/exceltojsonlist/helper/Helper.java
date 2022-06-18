package com.dataconversion.exceltojsonlist.helper;

import com.dataconversion.exceltojsonlist.entity.IndicesMasterPojo;
import com.dataconversion.exceltojsonlist.entity.Student;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Helper {

    Helper() {
    }

    // This method is for checking file is of Excel type or not
    public static boolean checkExcelFormat(MultipartFile multipartFile) {
        String contentType = multipartFile.getContentType();

        if (contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
            return true;
        } else {
            return false;
        }
    }

    // This method is for converts Excel to list of students
    public static List<Student> convertExcelToListProduct(InputStream is) {
        List<Student> list = new ArrayList<>();
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(is);

            XSSFSheet sheet = workbook.getSheet("student");

            int rowNumber = 0;
            Iterator<Row> iterator = sheet.iterator();
            while (iterator.hasNext()) {
                Row row = iterator.next();
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }
                Iterator<Cell> cells = row.iterator();

                Student student = new Student();

                int cid = 0;

                while (cells.hasNext()) {
                    Cell cell = cells.next();
                    switch (cid) {
                        case 0:
                            student.setSid((int) cell.getNumericCellValue());
                            break;
                        case 1:
                            student.setSname(cell.getStringCellValue());
                            break;
                        case 2:
                            student.setSalary(cell.getNumericCellValue());
                            break;
                        default:
                            break;
                    }
                    cid++;
                }
                list.add(student);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return list;
    }

    // This method is for converts Excel to list of students
    public static List<IndicesMasterPojo> convertExcelToIndicesMasterList(InputStream is) {
        List<IndicesMasterPojo> list = new ArrayList<>();
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(is);

            XSSFSheet sheet = workbook.getSheet("Website Image");

            int rowNumber = 0;
            Iterator<Row> iterator = sheet.iterator();
            while (iterator.hasNext()) {
                Row row = iterator.next();
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }
                Iterator<Cell> cells = row.iterator();

                IndicesMasterPojo indicesMasterPojo = new IndicesMasterPojo();

                int cid = 0;

                while (cells.hasNext()) {
                    Cell cell = cells.next();
                    switch (cid) {
                        case 0:
                            indicesMasterPojo.setYearfracFromInceptionDate(cell.getNumericCellValue());
                            break;
                        case 1:
                            indicesMasterPojo.setInceptionDate(cell.getDateCellValue());
                            break;
                        case 2:
                            indicesMasterPojo.setIndexType(cell.getStringCellValue());
                            break;
                        case 3:
                            indicesMasterPojo.setIndexCategory(cell.getStringCellValue());
                            break;
                        case 4:
                            indicesMasterPojo.setIndices(cell.getStringCellValue());
                            break;
                        case 5:
                            indicesMasterPojo.set_1Day(cell.getStringCellValue());
                            break;
                        case 6:
                            indicesMasterPojo.set_1Week(cell.getStringCellValue());
                            break;
                        case 7:
                            indicesMasterPojo.set_1Month(cell.getStringCellValue());
                            break;
                        case 8:
                            indicesMasterPojo.set_3Month(cell.getStringCellValue());
                            break;
                        case 9:
                            indicesMasterPojo.set_6Month(cell.getStringCellValue());
                            break;
                        case 10:
                            indicesMasterPojo.set_1Year(cell.getStringCellValue());
                            break;
                        case 11:
                            indicesMasterPojo.set_2Year(cell.getStringCellValue());
                            break;
                        case 12:
                            indicesMasterPojo.set_3Year(cell.getStringCellValue());
                            break;
                        case 13:
                            indicesMasterPojo.set_5Year(cell.getStringCellValue());
                            break;
                        case 14:
                            indicesMasterPojo.set_7Year(cell.getStringCellValue());
                            break;
                        case 15:
                            indicesMasterPojo.set_10Year(cell.getStringCellValue());
                            break;
                        case 16:
                            indicesMasterPojo.setSinceInception(cell.getStringCellValue());
                            break;
                        case 17:
                            indicesMasterPojo.setIndexValuesAsOnNovember182020(cell.getNumericCellValue());
                            break;
                        case 18:
                            indicesMasterPojo.setIndexValuesAsOnNovember172020(cell.getNumericCellValue());
                            break;
                        case 19:
                            indicesMasterPojo.setTenor(String.valueOf(cell.getNumericCellValue()));
                            break;
                        default:
                            break;
                    }
                    cid++;
                }
                list.add(indicesMasterPojo);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return list;
    }
}
