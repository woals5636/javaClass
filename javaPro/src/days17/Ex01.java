package days17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {

		String fileName = "SS21_Team.txt"; // 파일

		String myName = "김재민";
		String teamLeader = null; // 팀장
		String teamLine = null; // 조
		String teamMemberLine = null; // 팀원
		String[] teamMember = null; // 팀원들 저장할 배열
		String regex = "\\s*,\\s*"; // 파일내에서 "," 과 양쪽 공백에 상관없이 분리하도록 하는 정규표현식

		String key = "user.dir";
		String userDir = System.getProperty(key);
//		System.out.println(userDir);

		fileName = String.format("%s\\src\\days17\\%s", userDir, fileName);
//		System.out.println(fileName); 열고자하는 파일경로

		// try with resource 문
		try (FileReader reader = new FileReader(fileName); BufferedReader br = new BufferedReader(reader);) {

			while ((teamLine = br.readLine()) != null) {
				teamMemberLine = br.readLine();

				if (teamMemberLine.contains(myName)) { // myName이 포함되어 있다면 break
					break;
				} // if
			} // while

//			System.out.println(teamLine);	// 조명 출력
//			System.out.println(teamMemberLine);	//	조원 출력
			teamMember = teamMemberLine.split(regex); // regex 정규표현식으로 구분하여 팀원에 기입

			String prefix = "[팀장]";
			for (int i = 0; i < teamMember.length; i++) {
				if (teamMember[i].trim().startsWith(prefix)) { // 앞뒤 공백을 제거하여 "[팀장]"으로 시작하는 인덱스 라면
					teamLeader = teamMember[i].trim().replace(prefix, ""); // 앞뒤 공백을 제거하여 "[팀장]"으로 시작하는 인덱스를 teamLeader에
					// 기입
				}
			}
			//	System.out.println(teamLeader);
			// 나머지 팀원들을 내림차순으로 정렬
			String[] temp = new String[teamMember.length - 1]; // 팀장은 배열내 0번째 순서이기 때문에 팀장 1명을 제외한 문자열 배열 선언
			System.arraycopy(teamMember, 1, temp, 0, teamMember.length - 1);
			Arrays.sort(temp);	// 배열내 인덱스를 오름차순으로 정렬

			System.arraycopy(temp, 0, teamMember, 1, temp.length);
			//	System.out.println(Arrays.toString(teamMember));
			
//			Arrays.sort(temp,(s1,s2)->s2.compareTo(s1));	// 내림차순 정렬

	          StringBuilder sb = new StringBuilder(teamLine+"\n");
	          sb.append("<ul>\n");
	          sb.append("\t<li class=\"leader\">"+teamLeader+"</li>\n");
	          sb.append("\t<li>" );
	          sb.append( String.join("</li>\n\t<li>", temp) );
	          sb.append("</li>\n</ul>\n");

	          System.out.println(sb.toString());

		} catch (Exception e) {

		}
	}
}