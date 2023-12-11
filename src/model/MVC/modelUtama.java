/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.MVC;

/**
 *
 * @author resa c.r
 */
import controlevents.MVC.controlListener;

public class modelUtama 
{
    private controlListener cl;
    private String nama;
    
    public void setModelUtama(controlListener cl)
    {
        this.cl = cl;
    }
    
    public void setNama(String nama)
    {
        this.nama = nama;
        if(cl != null)
        {
            cl.Tampilkan(this);
        }
    }
    
    public String Output()
    {
        return "Nama anda adalah : " + nama;
    }
}
