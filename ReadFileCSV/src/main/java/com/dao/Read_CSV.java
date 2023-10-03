package com.dao;

import com.dto.CSV_DTO;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Read_CSV extends HandleReadFile<CSV_DTO>{
    @Override
    protected List<CSV_DTO> readFile(String strPath) {
        List<CSV_DTO> lst = new ArrayList<>();
        try {
            //Xac dinh file bang duong dan
            FileReader fileReader = new FileReader(strPath);
            //Doc file csv
            CSVReader readFile_CSV = new CSVReader(fileReader);
            //Doc tung dong
            List<String[]> records = readFile_CSV.readAll();
            //Bo dong dau - dong tieu de
            records.remove(0);
            //Lap moi phan tu
            for (String[] record:records) {
                CSV_DTO data = new CSV_DTO();
                data.setId(Integer.parseInt(record[0]));
                data.setName(record[1]);
                data.setFoundationDate(record[2]);
                data.setCapital(Long.parseLong(record[3]));
                data.setCountry(record[4]);
                data.setHeadQuarter(record[5].equals("1"));
                lst.add(data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvException e) {
            throw new RuntimeException(e);
        }
        return lst;
    }
    protected void processFile(List<CSV_DTO> data) {
        System.out.println("Function 1: ");
        data.forEach(System.out::println);
        System.out.println("Function 2: ");
        long totalCapital = data.stream().filter(item -> item.getCountry().equals("CH") && item.isHeadQuarter()).mapToLong(item -> item.getCapital()).sum();
        System.out.println("Total value Capital with Country = CH: " + totalCapital);
        System.out.println("Function 3: ");
        data.stream().filter(item -> item.getCountry().equals("CH")).sorted((a, b) -> (int) (a.getCapital() - b.getCapital())).collect(Collectors.toList()).forEach(System.out::println);

    }
}
