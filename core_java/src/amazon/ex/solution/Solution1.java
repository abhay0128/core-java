package amazon.ex.solution;

import io.github.pixee.security.BoundedLineReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Solution1 {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int logsCount = Integer.parseInt(BoundedLineReader.readLine(bufferedReader, 5_000_000).trim());

		
		List<String> logs = IntStream.range(0, logsCount).mapToObj(i -> {
			try {
				return BoundedLineReader.readLine(bufferedReader, 5_000_000);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).collect(Collectors.toList());

		int threshold = Integer.parseInt(BoundedLineReader.readLine(bufferedReader, 5_000_000).trim());

//		List<String> result = Result.processLogs(logs, threshold);

//		bufferedWriter.write(result.stream().collect(Collectors.joining("\n")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
	
}
