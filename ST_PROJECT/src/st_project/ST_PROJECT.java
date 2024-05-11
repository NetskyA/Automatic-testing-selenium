/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st_project;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.time.LocalDate;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Aldiaafn
 */
public class ST_PROJECT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.setProperty("webdriver.edge.EdgeDriver","C:\\Users\\Aldiaafn\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver wd= new EdgeDriver();
        wd.manage().window().maximize();
        
        //buat panggil browser nya atau situs website
        wd.get("https://dcbas.000webhostapp.com/");
        Thread.sleep(8000L);
        
        
        
        //============================= SALESMAN =============================//
//        //nyari id username
//        WebElement inputElement = wd.findElement(By.xpath("//input[@placeholder='name@email.com']"));
//        Thread.sleep(800L);
//        
//        //Username
//        inputElement.sendKeys("firdauszakaria@gmail.com");
//        Thread.sleep(800L);
//        
//        //Nyari Class password
//        WebElement inputElement2 = wd.findElement(By.xpath("//input[@name='password']"));
//        Thread.sleep(1000L);
//        
//        //Password
//        inputElement2.sendKeys("12345");
//        Thread.sleep(800L);
//   
//        //checkbox
//        wd.findElement(By.xpath("//input[@type='checkbox']")).click();
//        Thread.sleep(900L);
//        
//        //submit
//        wd.findElement(By.xpath("//button[@name='login']")).click();
//        Thread.sleep(5000L);
//        
//        //pindah halaman katalog
//        wd.findElement(By.xpath("//a[@href='/Salesman/Catalog']//img[@alt='add item']")).click();
//        Thread.sleep(8000L);
//        
//        //Export csv
//        wd.findElement(By.xpath("//button[@class='dt-button buttons-csv buttons-html5']")).click();
//        Thread.sleep(800L);
//        
//        //Menu toko
//        wd.findElement(By.xpath("//p[normalize-space()='Toko']")).click();
//        Thread.sleep(5000L);
//
//        //Export pdf
//        wd.findElement(By.xpath("//span[normalize-space()='Print']")).click();
//        Thread.sleep(2000L);
//        
//        //Buka menu order
//        wd.findElement(By.xpath("//p[normalize-space()='Order']")).click();
//        Thread.sleep(5000L);
//        
//        //Input order nama toko (belom selesai)
//        WebElement inputElement3 = wd.findElement(By.xpath("//input[@id='toko']"));
//
//        // Input the text (belom selesai)
//        inputElement3.sendKeys("AYUB JAYA");
//
//        //Simulate pressing the "Enter" key (belom selesai)
//        inputElement3.sendKeys(Keys.ENTER);
//
//        //Buka menu post
//        wd.findElement(By.xpath("//a[@href='/Salesman/Keranjang']//img[@alt='add item']")).click();
//        Thread.sleep(5000L);
//  
//        //Centang list order 1
//        wd.findElement(By.xpath("//input[@name='check']")).click();
//        Thread.sleep(2000L);
//
//       //Buka detail
//        wd.findElement(By.xpath("//tbody/tr[1]/td[8]")).click();
//        Thread.sleep(2000L);
//       
//        //Tutup detail
//        wd.findElement(By.xpath("//td[normalize-space()='Tutup']")).click();
//        Thread.sleep(2000L);
//
//        //Buka post refresh
//        wd.findElement(By.xpath("//a[@href='/Salesman/Keranjang']//img[@alt='add item']")).click();
//        Thread.sleep(5000L);
//      
//       //Submit order
//        wd.findElement(By.xpath("//button[@class='bg-primary w-52 h-16 rounded-xl text-white hover:bg-gray-300 hover:text-primary font-bold py-2 px-4']")).click();
//        Thread.sleep(2000L);
//
//        //Buka menu history
//        wd.findElement(By.xpath("//a[@href='/Salesman/History']//img[@alt='add item']")).click();
//        Thread.sleep(9000L);
//
//        //Detail
//        wd.findElement(By.xpath("//button[@class='bg-primary w-40 h-11 rounded-xl text-white hover:bg-gray-300 hover:text-primary font-bold py-2 px-4 klikbutton']")).click();
//        Thread.sleep(5000L);
//
// //       Kembali
//        wd.findElement(By.xpath("//button[@class='bg-primary w-40 h-12 rounded-xl text-white hover:bg-gray-300 hover:text-primary font-bold py-2 px-4']")).click();
//        Thread.sleep(5000L);
//        
//        //Buka menu retur
//        wd.findElement(By.xpath("//p[normalize-space()='Retur']")).click();
//        Thread.sleep(5000L);
//
//        //Pilih pengembalian
//        wd.findElement(By.xpath("//div[@class='Uang flex ms-5']//input[@id='radioDefault01']")).click();
//        Thread.sleep(2000L);
//
//        WebElement inputElement4 = wd.findElement(By.xpath("//input[@id='dates']"));
//        Thread.sleep(1000L);
//        
//        //Tanggal
//        inputElement4.sendKeys("12232023");
//        Thread.sleep(1000L);
//
//        //Cari No Order
//        WebElement inputElement5 = wd.findElement(By.xpath("//input[@id='idpemesanan']"));
//
//        // Input the text (belom selesai)
//        inputElement5.sendKeys("6");
//
//        //Simulate pressing the "Enter" key (belom selesai)
//        inputElement5.sendKeys(Keys.ENTER);
//        Thread.sleep(8000L);    
//        //Submit
//
//        //Logout
//        wd.findElement(By.xpath("//body/div[@id='root']/header[@class='flex']/div[@class='w-32 lg:w-36 overflow-hidden bg-transparent']/div[@class='nav fixed m-4 rounded-lg bg-white']/ul[@class='content-center mt-5 mb-5 m-1 border rounded-xl hover:bg-gray-300']/li[@class='content-center m-2 hover:text-white']/img[1]")).click();
//        Thread.sleep(4000L);
//        
//        //Yes logout
//        wd.findElement(By.xpath("//button[@class='bg-primary hover:bg-gray-400 m-1 w-36 rounded-lg']//p[text()='Iya']")).click();
//        Thread.sleep(1000L);
        //============================= SALESMAN =============================//
        
        
        
        //============================= SUPERVISOR =============================//
//        //nyari id username
//        WebElement inputElement6 = wd.findElement(By.xpath("//input[@placeholder='name@email.com']"));
//        Thread.sleep(1000L);
//        
//        //Username
//        inputElement6.sendKeys("ibrahimhasan@gmail.com");
//        Thread.sleep(300L);
//        
//        //Nyari Class password
//        WebElement inputElement7 = wd.findElement(By.xpath("//input[@name='password']"));
//        Thread.sleep(800L);
//        
//        //Password
//        inputElement7.sendKeys("12345");
//        
//        //checkbox
//        wd.findElement(By.xpath("//input[@type='checkbox']")).click();
//        Thread.sleep(800L);
//        
//        //submit
//        wd.findElement(By.xpath("//button[@name='login']")).click();
//        Thread.sleep(8000L);
//        
//        //Buka menu target
//        wd.findElement(By.xpath("//a[@href='/Supervisor/Target']//img[@alt='add item']")).click();
//        Thread.sleep(5000L);
//        
//        //Cari No Order
//        WebElement inputElement8 = wd.findElement(By.xpath("//input[@value='122']"));
//
//        // Input the text (belom selesai)
//        inputElement8.sendKeys("99");
//
//        //Simulate pressing the "Enter" key (belom selesai)
//        inputElement8.sendKeys(Keys.ENTER);
//        Thread.sleep(2000L);  
//
//        //submit
//        wd.findElement(By.xpath("//button[@class='bg-primary w-52 h-16 rounded-xl text-white hover:bg-gray-300 hover:text-primary font-bold py-2 px-4']")).click();
//        Thread.sleep(2000L);
//        
//        //Buka menu laporan
//        wd.findElement(By.xpath("//a[@href='/Supervisor/Toko']//img[@alt='add item']")).click();
//        Thread.sleep(10000L);
//        
//        //Buka Menu toko
//        wd.findElement(By.xpath("//a[@href='/Supervisor/Tambah-Toko']//img[@alt='add item']")).click();
//        Thread.sleep(10000L);
//        
//        //Buka menu laporan
//        wd.findElement(By.xpath("//a[@href='/Supervisor/Laporan']//img[@alt='add item']")).click();
//        Thread.sleep(10000L);
//        
//        //Tanggal awal
//        WebElement inputElement12 = wd.findElement(By.xpath("//input[@id='dateStart']"));
//        Thread.sleep(1000L);
//        
//        //Tanggal
//        inputElement12.sendKeys("12122023");
//        Thread.sleep(1000L);
//        
//        //Tanggal akhir
//        WebElement inputElement13 = wd.findElement(By.xpath("//input[@id='dateEnd']"));
//        Thread.sleep(1000L);
//        
//        //Tanggal
//        inputElement13.sendKeys("12142023");
//        Thread.sleep(1000L);
//        
//        //Cari
//        wd.findElement(By.xpath("//button[@class='bg-primary w-1/4 m-4 h-14 rounded-xl text-white hover:bg-gray-300 hover:text-primary font-bold py-2 px-4']")).click();
//        Thread.sleep(2000L);
//        
//        //Logout
//        wd.findElement(By.xpath("//body/div[@id='root']/header[@class='flex']/div[@class='w-32 lg:w-36 overflow-hidden bg-transparent']/div[@class='nav fixed m-4 rounded-lg bg-white']/ul[@class='content-center mt-5 mb-5 m-1 border rounded-xl hover:bg-gray-300']/li[@class='content-center m-2 hover:text-white']/img[1]")).click();
//        Thread.sleep(4000L);
// 
//        //Yes logout
//        wd.findElement(By.xpath("//button[@class='bg-primary hover:bg-gray-400 m-1 w-36 rounded-lg']//p[text()='Iya']")).click();
//        Thread.sleep(1000L);

        //============================= SUPERVISOR =============================//
        
        
        //============================= KOORDINATOR SUPERVISOR =============================//
//        //input username
//        WebElement inputElement15 = wd.findElement(By.xpath("//input[@placeholder='name@email.com']"));
//        Thread.sleep(1000L);
//        
//        //Username
//        inputElement15.sendKeys("mansurtirta@gmail.com");
//        Thread.sleep(300L);
//        
//        //Nyari Class password
//        WebElement inputElement16 = wd.findElement(By.xpath("//input[@name='password']"));
//        Thread.sleep(800L);
//        
//        //Password
//        inputElement16.sendKeys("12345");
//        
//        //checkbox
//        wd.findElement(By.xpath("//input[@type='checkbox']")).click();
//        Thread.sleep(800L);
//        
//        //submit
//        wd.findElement(By.xpath("//button[@name='login']")).click();
//        Thread.sleep(8000L);
//        
//        //Buka menu target
//        wd.findElement(By.xpath("//a[@href='/KoordinatorSupervisor/Target']//img[@alt='add item']")).click();
//        Thread.sleep(5000L);
//        
//        //Buka menu laporan
//        wd.findElement(By.xpath("//a[@href='/KoordinatorSupervisor/Laporan']//img[@alt='add item']")).click();
//        Thread.sleep(5000L);
//        
//        //Tanggal awal
//        WebElement inputElement18 = wd.findElement(By.xpath("//input[@id='dateStart']"));
//        Thread.sleep(1000L);
//        
//        //Tanggal
//        inputElement18.sendKeys("12012023");
//        Thread.sleep(1000L);
//        
//        //Tanggal akhir
//        WebElement inputElement19 = wd.findElement(By.xpath("//input[@id='dateEnd']"));
//        Thread.sleep(1000L);
//        
//        //Tanggal
//        inputElement19.sendKeys("12242023");
//        Thread.sleep(1000L);
//        
//        //Tombol supervisor
//        wd.findElement(By.xpath("//button[@class='bg-primary m-4 w-full h-16 rounded-xl text-white hover:bg-gray-300 hover:text-primary font-bold py-2 px-4']")).click();
//        Thread.sleep(8000L);
//        
//        //Tanggal awal
//        WebElement inputElement20 = wd.findElement(By.xpath("//input[@id='dateStart']"));
//        Thread.sleep(1000L);
//        
//        //Tanggal
//        inputElement20.sendKeys("11012023");
//        Thread.sleep(1000L);
//        
//        //Tanggal akhir
//        WebElement inputElement21 = wd.findElement(By.xpath("//input[@id='dateEnd']"));
//        Thread.sleep(1000L);
//        
//        //Tanggal
//        inputElement21.sendKeys("12242023");
//        Thread.sleep(1000L);
//        
//        //Tombol salesman
//        wd.findElement(By.xpath("//button[@class='bg-primary w-full m-4 h-16 rounded-xl text-white hover:bg-gray-300 hover:text-primary font-bold py-2 px-4']")).click();
//        Thread.sleep(8000L);
//                
//        //Logout
//        wd.findElement(By.xpath("//body/div[@id='root']/header[@class='flex']/div[@class='w-32 lg:w-36 overflow-hidden bg-transparent']/div[@class='nav fixed m-4 rounded-lg bg-white']/ul[@class='content-center mt-5 mb-5 m-1 border rounded-xl hover:bg-gray-300']/li[@class='content-center m-2 hover:text-white']/img[1]")).click();
//        Thread.sleep(4000L);
//
//        //Yes logout
//        wd.findElement(By.xpath("//button[@class='bg-primary hover:bg-gray-400 m-1 w-36 rounded-lg']//p[text()='Iya']")).click();
//        Thread.sleep(1000L);
        //============================= KOORDINATOR SUPERVISOR =============================//
        
        
        //============================= ADMIN PENJUALAN ================================//
//        //input username
//        WebElement inputElement22 = wd.findElement(By.xpath("//input[@placeholder='name@email.com']"));
//        Thread.sleep(1000L);
//        
//        //Username
//        inputElement22.sendKeys("darmaanwar@gmail.com");
//        Thread.sleep(300L);
//        
//        //Nyari Class password
//        WebElement inputElement23 = wd.findElement(By.xpath("//input[@name='password']"));
//        Thread.sleep(800L);
//        
//        //Password
//        inputElement23.sendKeys("12345");
//        
//        //checkbox
//        wd.findElement(By.xpath("//input[@type='checkbox']")).click();
//        Thread.sleep(800L);
//        
//        //submit
//        wd.findElement(By.xpath("//button[@name='login']")).click();
//        Thread.sleep(8000L);
//        
//        //Pilih verifiksi kelurahan
//        wd.findElement(By.xpath("//button[normalize-space()='NGAGEL']")).click();
//        Thread.sleep(2000L);
//        
//        //Pilih verfikasi darmo
//        wd.findElement(By.xpath("//button[normalize-space()='DARMO']")).click();
//        Thread.sleep(5000L);
//        
//        //Checkbox
//        wd.findElement(By.xpath("//th[@class='px-6 py-2 w-5']//input[@id='all']")).click();
//        Thread.sleep(8000L);
//        
//        //Submit
//        wd.findElement(By.xpath("//button[@class='w-52 h-14 m-2 items-end bg-primary rounded-xl hover:bg-gray-300 text-white hover:text-primary font-bold py-2 px-4']")).click();
//        Thread.sleep(800L);
//        
//        //Buka Menu print
//        wd.findElement(By.xpath("//a[@href='/AdminPenjualan/Print-Orderan-Penjualan']//img[@alt='add item']")).click();
//        Thread.sleep(2000L);
//        
//        //Tanggal awal
//        WebElement inputElement188 = wd.findElement(By.xpath("//input[@id='dateStart']"));
//        Thread.sleep(1000L);
//        
//        //Tanggal
//        inputElement188.sendKeys("12012023");
//        Thread.sleep(1000L);
//        
//        //Tanggal akhir
//        WebElement inputElement198 = wd.findElement(By.xpath("//input[@id='dateEnd']"));
//        Thread.sleep(1000L);
//        
//        //Tanggal
//        inputElement198.sendKeys("12242023");
//        Thread.sleep(1000L);
//        
//        //submit
//        wd.findElement(By.xpath("//button[@class='w-52 h-14 items-end bg-primary rounded-xl hover:bg-gray-300 text-white hover:text-primary font-bold py-2 px-4']")).click();
//        Thread.sleep(3000L);
//        
//        //Area
//        wd.findElement(By.xpath("//button[normalize-space()='DARMO']")).click();
//        Thread.sleep(14000L);
//        
//        //Buka menu laporan
//        wd.findElement(By.xpath("//a[@href='/AdminPenjualan/Laporan-Orderan-Penjualan']//img[@alt='add item']")).click();
//        Thread.sleep(10000L);
//        
//        //Logout
//        wd.findElement(By.xpath("//body/div[@id='root']/header[@class='flex']/div[@class='w-32 lg:w-36 overflow-hidden bg-transparent']/div[@class='nav fixed m-4 rounded-lg bg-white']/ul[@class='content-center mt-5 mb-5 m-1 border rounded-xl hover:bg-gray-300']/li[@class='content-center m-2 hover:text-white']/img[1]")).click();
//        Thread.sleep(4000L);
//
//         //Yes logout
//        wd.findElement(By.xpath("//button[@class='bg-primary hover:bg-gray-400 m-1 w-36 rounded-lg']//p[text()='Iya']")).click();
//        Thread.sleep(1000L);

        //============================= ADMIN PENJUALAN ================================//
        
        //============================= ADMIN GAJI ================================//
        //input username
//        WebElement inputElement24 = wd.findElement(By.xpath("//input[@placeholder='name@email.com']"));
//        Thread.sleep(1000L);
//        
//        //Username
//        inputElement24.sendKeys("agungbuana@gmail.com");
//        Thread.sleep(300L);
//        
//        //Nyari Class password
//        WebElement inputElement25 = wd.findElement(By.xpath("//input[@name='password']"));
//        Thread.sleep(800L);
//        
//        //Password
//        inputElement25.sendKeys("12345");
//        
//        //checkbox
//        wd.findElement(By.xpath("//input[@type='checkbox']")).click();
//        Thread.sleep(800L);
//        
//        //submit
//        wd.findElement(By.xpath("//button[@name='login']")).click();
//        Thread.sleep(8000L);
//        
//        //Divisi
//        wd.findElement(By.xpath("//select[@id='divisi']")).click();
//        Thread.sleep(800L);
//        
//        //Divisi pilih
//        wd.findElement(By.xpath("//option[@value='1']")).click();
//        Thread.sleep(1000L);
//        
//        //Back
//        wd.findElement(By.xpath("//div[contains(@class,'row ms-4 m-4 w-full')]")).click();
//        Thread.sleep(1000L);
//        
//        //Cari
//        wd.findElement(By.xpath("//button[@id='cari']")).click();
//        Thread.sleep(2000L);
//        
//        //Kirim gaji
//        wd.findElement(By.xpath("//button[@class='w-52 h-14 items-end bg-primary rounded-2xl hover:bg-gray-300 text-white hover:text-primary font-bold py-2 px-4']")).click();
//        Thread.sleep(4000L);
//        
//        //Buka menu komisi
//        wd.findElement(By.xpath("//a[contains(@href,'/AdminGaji/Komisi-Karyawan')]//img[contains(@alt,'add item')]")).click();
//        Thread.sleep(1000L);
//        
//        //Divisi
//        wd.findElement(By.xpath("//select[@id='divisi']")).click();
//        Thread.sleep(800L);
//        
//        //Divisi pilih
//        wd.findElement(By.xpath("//option[@value='1']")).click();
//        Thread.sleep(1000L);
//        
//        wd.findElement(By.xpath("//div[@class='row ms-4 m-4 w-full']")).click();
//        Thread.sleep(1000L);
//        
//        //Cari
//        wd.findElement(By.xpath("//button[@class='w-36 h-12 items-end bg-primary rounded-xl hover:bg-gray-300 text-white hover:text-primary font-bold py-2 px-4']")).click();
//        Thread.sleep(2000L);
//
//        //Simpan
//        wd.findElement(By.xpath("//button[contains(@class,'w-52 h-14 items-end bg-primary rounded-2xl hover:bg-gray-300 text-white hover:text-primary font-bold py-2 px-4')]")).click();
//        Thread.sleep(5000L);
//        
//        //Buka menu laporan
//        wd.findElement(By.xpath("//a[contains(@href,'/AdminGaji/Laporan-Gaji-Karyawan')]//img[contains(@alt,'add item')]")).click();
//        Thread.sleep(12000L);
//                
//        //Logout
//        wd.findElement(By.xpath("//body/div[@id='root']/header[@class='flex']/div[@class='w-32 lg:w-36 overflow-hidden bg-transparent']/div[@class='nav fixed m-4 rounded-lg bg-white']/ul[@class='content-center mt-5 mb-5 m-1 border rounded-xl hover:bg-gray-300']/li[@class='content-center m-2 hover:text-white']/img[1]")).click();
//        Thread.sleep(4000L);
//
//        //Yes logout
//        wd.findElement(By.xpath("//button[@class='bg-primary hover:bg-gray-400 m-1 w-36 rounded-lg']//p[text()='Iya']")).click();
//        Thread.sleep(1000L);
        
        //============================= ADMIN GAJI ================================//
        
        //============================= ADMIN WEBSITE ================================//
        //input username
        WebElement inputElement40 = wd.findElement(By.xpath("//input[@placeholder='name@email.com']"));
        Thread.sleep(1000L);
        
        //Username
        inputElement40.sendKeys("abdulahmad@gmail.com");
        Thread.sleep(300L);
        
        //Nyari Class password
        WebElement inputElement41 = wd.findElement(By.xpath("//input[@name='password']"));
        Thread.sleep(800L);
        
        //Password
        inputElement41.sendKeys("12345");
        
        //checkbox
        wd.findElement(By.xpath("//input[@type='checkbox']")).click();
        Thread.sleep(1000L);
        
        //submit
        wd.findElement(By.xpath("//button[@name='login']")).click();
        Thread.sleep(8000L);

        //Buka menu sales
        wd.findElement(By.xpath("//a[contains(@href,'/AdminWebsite/Laporan-Sales')]//img[contains(@alt,'add item')]")).click();
        Thread.sleep(10000L); 
        
        //Tanggal awal
        WebElement inputElement45 = wd.findElement(By.xpath("//input[@id='dateStart']"));
        Thread.sleep(1000L);
        
        //Tanggal
        inputElement45.sendKeys("12112020");
        Thread.sleep(1000L);
        
        //Tanggal akhir
        WebElement inputElement46 = wd.findElement(By.xpath("//input[@id='dateEnd']"));
        Thread.sleep(1000L);
        
        //Tanggal
        inputElement46.sendKeys("12102021");
        Thread.sleep(1000L);

        //cari
        wd.findElement(By.xpath("//button[contains(@class,'bg-primary w-52 m-4 h-16 rounded-xl text-white hover:bg-gray-300 hover:text-primary font-bold py-2 px-4')]")).click();
        Thread.sleep(5000L);
        
        
        //Buka menu gaji
        wd.findElement(By.xpath("//a[contains(@href,'/AdminWebsite/Laporan-Gaji')]//img[contains(@alt,'add item')]")).click();
        Thread.sleep(10000L);
        
        //Buka menu kinerja
        wd.findElement(By.xpath("//a[contains(@href,'/AdminWebsite/Laporan-Kinerja')]//img[contains(@alt,'add item')]")).click();
        Thread.sleep(10000L);
        
        //Buka menu target
        wd.findElement(By.xpath("//a[contains(@href,'/AdminWebsite/Laporan-Target')]//img[contains(@alt,'add item')]")).click();
        Thread.sleep(10000L);
        
        //Tanggal awal
        WebElement inputElement47 = wd.findElement(By.xpath("//input[@id='dateStart']"));
        Thread.sleep(1000L);
        
        //Tanggal
        inputElement47.sendKeys("12012023");
        Thread.sleep(1000L);
        
        //Tanggal akhir
        WebElement inputElement48 = wd.findElement(By.xpath("//input[@id='dateEnd']"));
        Thread.sleep(1000L);
        
        //Tanggal
        inputElement48.sendKeys("12242023");
        Thread.sleep(1000L);
        
        //salesman
        wd.findElement(By.xpath("//button[contains(@class,'bg-primary m-4 w-full h-16 rounded-xl text-white hover:bg-gray-300 hover:text-primary font-bold py-2 px-4')]")).click();
        Thread.sleep(6000L);
        
        //Buka menu register user
        wd.findElement(By.xpath("//a[contains(@href,'/AdminWebsite/Register-User')]//img[contains(@alt,'add item')]")).click();
        Thread.sleep(10000L);

        //Nama user
        WebElement inputElement42 = wd.findElement(By.xpath("//input[@id='username']"));
        Thread.sleep(1000L);
        
        //Username
        inputElement42.sendKeys("abdulahmad@gmail.com");
        Thread.sleep(1000L);
        
        //Pass user
        WebElement inputElement43 = wd.findElement(By.xpath("//input[@id='password']"));
        Thread.sleep(1000L);
        
        //pass
        inputElement43.sendKeys("12345");
        Thread.sleep(1000L);
        
        //alamat user
        WebElement inputElement44 = wd.findElement(By.xpath("//input[@id='alamat']"));
        Thread.sleep(1000L);
        
        //alamt
        inputElement44.sendKeys("jln apa aja yang penting sama kamu");
        Thread.sleep(1000L);
        
        //no hp
        WebElement inputElement50 = wd.findElement(By.xpath("//input[@id='nohp']"));
        Thread.sleep(1000L);
        
        //no hp
        inputElement50.sendKeys("1244444444");
        Thread.sleep(1000L);
        
        //email
        WebElement inputElement51 = wd.findElement(By.xpath("//input[@id='email']"));
        Thread.sleep(1000L);
        
        //email
        inputElement51.sendKeys("beby@gmail.com");
        Thread.sleep(1000L);
        
        //rekening
        WebElement inputElement52 = wd.findElement(By.xpath("//input[@id='rekening']"));
        Thread.sleep(1000L);
        
        //rekening
        inputElement52.sendKeys("0444444442");
        Thread.sleep(1000L);
        
        //jabatan
        wd.findElement(By.xpath("//input[@id='admingaji']")).click();
        Thread.sleep(1000L);
        
        //photo
        wd.findElement(By.xpath("//p[@class='text-2xl pt-3 text-center']")).click();
        Thread.sleep(9000L);
       
        //submit
        wd.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(9000L);
        
        
        //Master 
        wd.findElement(By.xpath("//a[contains(@href,'/AdminWebsite/Master')]//img[contains(@alt,'add item')]")).click();
        Thread.sleep(7000L);
       
        //toko
        wd.findElement(By.xpath("//button[normalize-space()='Toko']")).click();
        Thread.sleep(4000L);
        
        //tambah toko
        wd.findElement(By.xpath("//button[normalize-space()='+ Tambah Toko']")).click();
        Thread.sleep(4000L);
        
        //Nama toko
        WebElement inputElement53 = wd.findElement(By.xpath("//input[@placeholder='Nama Toko']"));
        Thread.sleep(1000L);
        
        //nama toko
        inputElement53.sendKeys("Wadorr");
        Thread.sleep(1000L);
        
        //kelurahan
        wd.findElement(By.xpath("//select[@id='selectIdbarang']")).click();
        Thread.sleep(4000L);
        
        //kelurahan
        wd.findElement(By.xpath("//option[@value='KLR00005']")).click();
        Thread.sleep(4000L);
        
        //nama konsumen
        WebElement inputElement54 = wd.findElement(By.xpath("//input[@placeholder='Nama Konsumen']"));
        Thread.sleep(1000L);
        
        //nama toko
        inputElement54.sendKeys("Aji");
        Thread.sleep(1000L);
        
        //alamat toko
        WebElement inputElement55 = wd.findElement(By.xpath("//input[@placeholder='Alamat Toko']"));
        Thread.sleep(1000L);
        
        //nama toko
        inputElement55.sendKeys("Jln. mana aja yang penting jalan");
        Thread.sleep(1000L);
        
        //Hp 1
        WebElement inputElement56 = wd.findElement(By.xpath("//input[@placeholder='No Handphone 1']"));
        Thread.sleep(1000L);
        
        //Hp 1
        inputElement56.sendKeys("091111111111");
        Thread.sleep(1000L);
        
        //Hp 2
        WebElement inputElement57 = wd.findElement(By.xpath("//input[@placeholder='No Handphone 2']"));
        Thread.sleep(1000L);
        
        //Hp 2
        inputElement57.sendKeys("09844444444");
        Thread.sleep(1000L);
        
        //submit
        wd.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000L);
        
        //tutup tambah toko
        wd.findElement(By.xpath("//button[normalize-space()='+ Tambah Toko']")).click();
        Thread.sleep(5000L);
        
        //master toko
        wd.findElement(By.xpath("//button[normalize-space()='Master Toko']")).click();
        Thread.sleep(8000L);
        
        //Logout
        wd.findElement(By.xpath("//body/div[@id='root']/header[@class='flex']/div[@class='w-32 lg:w-36 overflow-hidden bg-transparent']/div[@class='nav fixed m-4 rounded-lg bg-white']/ul[@class='content-center mt-5 mb-5 m-1 border rounded-xl hover:bg-gray-300']/li[@class='content-center m-2 hover:text-white']/img[1]")).click();
        Thread.sleep(4000L);

        //Yes logout
        wd.findElement(By.xpath("//button[@class='bg-primary hover:bg-gray-400 m-1 w-36 rounded-lg']//p[text()='Iya']")).click();
        Thread.sleep(1000L);
        

        //============================= ADMIN WEBSITE ================================//
        
        wd.quit();
    }
    
}
