/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author willi
 */
public class NameDaompl implements NameDao {
    List<Name> name;
    
    public NameDaompl(){
        name = new ArrayList<Name>();
        name.add(new Name("William J.H - Nadya M.A",0));
        name.add(new Name("672020001-672020002",1));
        name.add(new Name("Transaksi Gagal!",2));
        name.add(new Name("Transaksi Berhasil!",3));
        name.add(new Name("Transaksi Gagal! Saldo Minimum Rp.100000!",4));
        name.add(new Name("Saldo Tidak Mencukupi",5));
        name.add(new Name("Nominal Harus Kelipatan Rp.100000 Atau Rp.50000!",6));
    }

    @Override
    public List<Name> getAllName() {
        return name;
    }

    @Override
    public Name getName(int listNum) {
        return name.get(listNum);
    }
}
