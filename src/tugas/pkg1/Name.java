/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author willi
 */
public class Name {
    private String name;
    private int listNum;
   
    Name(String name, int listNum)
    {
        this.name = name;
        this.listNum = listNum;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getListNum()
    {
        return listNum;
    }
    
    public void setListNum (int listNum)
    {
        this.listNum = listNum;
    }
    
}
