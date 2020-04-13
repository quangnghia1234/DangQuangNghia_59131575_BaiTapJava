/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTsodo;

import java.util.ArrayList;

/**
 *
 * @author Laptop
 */
public class QLDS {
    ArrayList<CaNhan> ds;

    public QLDS() {
        ds = new ArrayList();
    }
    
    public int them(CaNhan p) {
        ds.add(p);
        return 1;
    }

    public int xoa(String ten) {
       for (int i = 0; i<ds.size(); i++){
            if (ds.get(i).getHoTen().equals(ten)){
                ds.remove(i);
            }
        }
        return 1;
    }
    
    public void inDS() {
        for(int i=0; i<ds.size(); i++){
            ds.get(i).hienthiTT();
        }
    }
}
