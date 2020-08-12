/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhnlt.filterMappingData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class FilterMapping {
    private Map<String, String> filterData;

    public Map<String, String> getFilterData() {
        return filterData;
    }
    
    public void addData(String direct) throws FileNotFoundException{
        File file = new File(direct, "Data.txt");
        Scanner readFile = new Scanner(file);
        this.filterData = new HashMap<String, String>();
        
        while(readFile.hasNext()){
            String temp = readFile.nextLine();
            String[] data = temp.split("=");
            for (int i = 0; i < data.length; i++) {
                this.filterData.put(data[i], data[++i]);
            }
        }
        readFile.close();
    }
}
