/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control.MVC;
/**
 *
 * @author resa c.r
 */
import model.MVC.modelUtama;
import view.MVC.frameUtama;
        
public class controlUtama
{
    private modelUtama mu;
    
    public void setModelUtama(modelUtama mu)
    {
        this.mu = mu;
    }
    
    public void TampilOutPut(frameUtama frame,controlKonfirmasi ck)
    {
        String nama = frame.getTxtNama().getText();
        if(nama.isEmpty())
        {
            ck.Peringatan("Silahkan isi nama anda");
            return;
        }
        mu.setNama(nama);
    }
}
