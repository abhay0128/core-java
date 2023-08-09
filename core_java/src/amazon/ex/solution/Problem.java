package amazon.ex.solution;

import java.util.ArrayList;
import java.util.List;

public class Problem {

	public static List<String> processLogs(List<String> logs, int threshold) {
		List<String> userIds = new ArrayList<>();
		List<String> finalList = new ArrayList<>();

		/*
		 * for (String logElement : logs) { String[] eachLogArr = logElement.split(" ");
		 * String senderId = eachLogArr[0]; String recId = eachLogArr[1]; String
		 * transAmt = eachLogArr[2];
		 * 
		 * if (senderId.length() > 9 || recId.length() > 9 || transAmt.length() > 9) {
		 * throw new RuntimeException("input validation failed"); } else {
		 * if(senderId.equals(recId)) { userIds.add(senderId); } else {
		 * userIds.add(senderId); userIds.add(recId); } } }
		 */
		logs.forEach(e->{
			String[] sarr = e.split(" ");
			if(sarr[0].length()>9 || sarr[1].length()>9 || sarr[2].length()>9) {
				throw new RuntimeException("validation failed!");
			} else {
				if(sarr[0].equals(sarr[1])) userIds.add(sarr[0]);
				else {
					userIds.add(sarr[0]);
					userIds.add(sarr[1]);
				}
			}
			
		});
		System.out.println("userIds:"+userIds);
		for (String uid : userIds) {
			int count = 0;
			for (int i = 0; i < userIds.size(); i++) {
				if (uid.equals(userIds.get(i))) {
					count++;
				}
			}
			if (count >= threshold && !finalList.contains(uid)) {
				finalList.add(uid);
			}
		}
		
		System.out.println(finalList);
		return userIds;

	}

	public static void main(String[] args) {
		List<String> logs = new ArrayList<>();
		logs.add("88 88 200");
		logs.add("99 99 300");
		logs.add("12 12 15");
		logs.add("88 99 500");
		logs.add("99 12 700");
		logs.add("99 12 700");
		logs.add("12 88 150");

		processLogs(logs, 4);

	}

}
