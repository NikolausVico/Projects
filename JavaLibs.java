import javax.swing.JOptionPane;

public class JavaLibs {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "This is a simple prototype about bank information" , "Welcome", JOptionPane.INFORMATION_MESSAGE );
		String email = JOptionPane.showInputDialog("Masukan alaman email anda");
		String name = JOptionPane.showInputDialog("Masukan nama anda!");
	    String date = JOptionPane.showInputDialog("Masukan tanggal lahir anda (ddmmyyyy)");
	    String place = JOptionPane.showInputDialog("Masukan tempat kelahiran!");
	    String age = JOptionPane.showInputDialog("Masukan umur anda!");
	    String job = JOptionPane.showInputDialog("Masukan pekerjaan anda :");
	    String domicile = JOptionPane.showInputDialog("Masukan alamat rumah anda :");
	    String phone = JOptionPane.showInputDialog("Masukan No.Hp anda");
	    JOptionPane.showMessageDialog(null, "Nama : "+name+'\n'+"EMAIL : "+email+'\n'+"Nomor Hp : "+phone+'\n'+"Alamat rumah : "+domicile+'\n'+"Tanggal lahir : "+date+'\n'+"Tempat kelahiran : "+place+'\n'+"Umur : "+age+'\n'+"Pekerjaan :"+job+'\n'+'\n'+ "Jika sudah benar silahkan lanjutkan!", "Identitas diri", JOptionPane.INFORMATION_MESSAGE);
String pin = JOptionPane.showInputDialog("Masukan Pin Anda");
String depo = JOptionPane.showInputDialog("Masukan Jumlah uang deposit pertama");
JOptionPane.showMessageDialog(null,"Anda akan diberi bonus Rp.200.000 dan bonus 3 persen karena mencoba fitur baru kami","Selamat!!!", JOptionPane.INFORMATION_MESSAGE);
int depo01 = Integer.parseInt(depo)+200000;
String depoString = String.valueOf(depo01);
String norek = date+phone;
Double deponet = Double.parseDouble(depoString); 
Double deponet01 = deponet+deponet*0.03;
JOptionPane.showMessageDialog(null, "No. Rekening : "+norek+'\n'+"Deposit awal : Rp."+depo+'\n'+"Tabungan anda sekarang : Rp."+deponet01+'\n'+'\n'+"Klik ok untuk menyudahi","Informasi tabungan", JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showConfirmDialog(null, "Apakah anda menyukai pelayanan kami?", "Survey singkat", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
JOptionPane.showMessageDialog(null, "Terima kasih telah menggunakan layanan kami", "Attention!", JOptionPane.INFORMATION_MESSAGE);

	}

}
