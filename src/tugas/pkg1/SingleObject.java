/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author willi
 */

public class SingleObject
{

private static SingleObject instance = new SingleObject();


private SingleObject() 
{
    
}
public static SingleObject getInstance()
{
    return instance;
}
public void show(int balance)
        {
            System.out.println("Saldo Anda Rp." +balance);
        }
}
