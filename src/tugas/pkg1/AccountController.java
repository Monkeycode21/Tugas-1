/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author willi
 */
public class AccountController {
    private Account model;
    private AccountView view;
    
    public AccountController(Account model, AccountView view)
    {
        this.model = model;
        this.view = view;
    }
    
    public void setAccountBalance(int nominal)
    {
        model.setNominal(nominal);
    }
    
    public int getAccountBalance()
    {
        return model.getNominal();
    }
    
    public void updateView()
    {
        view.printAccountDetails(model.getNominal());
    }
}
