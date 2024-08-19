package days21;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * @author jam
 * @date 2024. 7. 29. - 오후 2:28:51
 * @subject
 * @content
 *
 */
public class Ex09 {
	public static void main(String[] args) {
		// DataInputStream / DataOutputStream
		// 바이트 스트림
		// 기본형 8가지를 읽기/쓰기
		String name = "홍길동";
		int kor=98, eng=89, mat =20;
		int tot = kor + eng + mat;
		double avg = (double)tot / 3;
		boolean gender = true;
				
		// student.txt 파일로 저장
		String fileName = ".\\src\\days21\\student.dat";
		try (FileOutputStream fos = new FileOutputStream(fileName);
				DataOutputStream dos = new DataOutputStream(fos)){
			
			dos.writeUTF("홍길동");
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
		
	}// main
}// class
