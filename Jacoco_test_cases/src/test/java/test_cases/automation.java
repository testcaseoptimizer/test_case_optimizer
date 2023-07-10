package test_cases;
import java.io.File;
import java.io.IOException;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class automation {

	@Test
    public void automated() throws Exception {
            // Provide the path to your startup.bat file
		   
            String tomcatDir = "D:\\apache-tomcat-9.0.76-windows-x64\\apache-tomcat-9.0.76";
            Object[] testCases = {
                    new test_case_all_except_Auto_Bank_Tour_guide(),
                    new test_case_all_except_Auto_Bank(),
                    new test_case_all_except_Auto_Ticket_Tour_guide(),
                    new test_case_all_except_Auto_Tour_guide(),
                    new test_case_all_except_Auto(),
                    new test_case_all_except_Ticket_Tour_guide(),
                    new test_case_all_except_Tour_guide(),
                    new test_case_Auto_Bank_Cricket_Jee_passout_QK_employee(),
                    new test_case_Auto_Bank_Cricket_Jee_passout(),
                    new test_case_Auto_Bank_Cricket_Jee_QK_seller(),
                    new test_case_Auto_Bank_Cricket(),
                    new test_case_Auto_Bank_duo(),
                    new test_case_Auto_driver(),
                    new test_case_Bank_account(),
                    new test_case_Bank_Cricket_and_except_Actors(),
                    new test_case_Bank_Cricket_Jee_passout_and_except_actors(),
                    new test_case_Bank_Cricket_Jee_passout_QK_and_except_actors(),
                    new test_case_Bank_Cricket_Jee_passout_Qk_seller_and_except_actors(),
                    new test_case_Cricket_Jee_passout_except_Actors(),
                    new test_case_Cricket_Jee_QK_except_Actors(),
                    new test_case_Cricket_Jee_QK_seller_except_Actors(),
                    new test_case_Cricket_Jee_QK_seller_student_except_Actors(),
                    new test_case_Cricketer(),
                    new test_case_Jee_passout(),
                    new test_case_QK_employee(),
                    new test_case_sellers(),
                    new test_case_students(),
                    new test_case_Ticket(),
                    new test_case_Tour_guide(),
                    new test_cases_all(),
                    new All_Except_Actor_Arrival_Broker_except_first_three(),
                    new All_Except_Actor_Arrival_except_first_three(),
                    new All_Except_Actor_Broker_except_first_three(),
                    new All_Except_Actor_Employee_except_first_three(),
                    new All_Except_Actor_except_first_three(),
                    new All_Except_Arrival_Broker_Employee_except_first_three(),
                    new All_Except_Arrival_Broker_except_first_three(),
                    new All_Except_Arrival_Employee_except_first_three(),
                    new All_Except_Arrival_Footballer_except_first_three(),
                    new All_Except_Arrival_except_first_three(),
                    new All_Except_Broker_Employee_Footballer_except_first_three(),
                    new All_Except_Broker_Employee_except_first_three(),
                    new All_Except_Broker_Footballer_except_first_three(),
                    new All_Except_Broker_except_first_three(),
                    new All_Except_Employee_Footballer_movie_except_first_three(),
                    new All_Except_Employee_Footballer_except_first_three(),
                    new All_Except_Employee_except_first_three(),
                    new All_Except_Footballer_Movie_Scientist_except_first_three(),
                    new All_Except_Footballer_Movie_except_first_three(),
                    new All_Except_footballer_except_first_three(),
                    new All_Except_Movie_Scientist_except_first_three(),
                    new All_Except_Movie_except_first_three(),
                    new All_Except_Scientist_except_first_three(),
                    new Only_Actor(),
                    new Only_Arrival(),
                    new Only_Broker(),
                    new Only_Employee(),
                    new Only_Footballer(),
                    new Only_Movie(),
                    new Only_Scientist()};
                    
                   

            String[] testCaseNames={ "test_case_all_except_Auto_Bank_Tour_guide"
            		              ," test_case_all_except_Auto_Bank"
                                  ,"test_case_all_except_Auto_Ticket_Tour_guide"
                                  , "test_case_all_except_Auto_Tour_guide"
                                  , "test_case_all_except_Auto"
                                  , "test_case_all_except_Ticket_Tour_guide"
                                  , "test_case_all_except_Tour_guide"
                                  , "test_case_Auto_Bank_Cricket_Jee_passout_QK_employee"
                                  , "test_case_Auto_Bank_Cricket_Jee_passout"
                                  , "test_case_Auto_Bank_Cricket_Jee_QK_seller"
                                  , "test_case_Auto_Bank_Cricket"
                                  , "test_case_Auto_Bank_duo"
                                  , "test_case_Auto_driver"
                                  , "test_case_Bank_account"
                                  , "test_case_Bank_Cricket_and_except_Actors"
                                  , "test_case_Bank_Cricket_Jee_passout_and_except_actors"
                                  , "test_case_Bank_Cricket_Jee_passout_QK_and_except_actors"
                                  , "test_case_Bank_Cricket_Jee_passout_Qk_seller_and_except_actors"
                                  , "test_case_Cricket_Jee_passout_except_Actors"
                                  , "test_case_Cricket_Jee_QK_except_Actors"
                                  , "test_case_Cricket_Jee_QK_seller_except_Actors"
                                  , "test_case_Cricket_Jee_QK_seller_student_except_Actors"
                                  , "test_case_Cricketer"
                                  , "test_case_Jee_passout"
                                  , "test_case_QK_employee"
                                  , "test_case_sellers"
                                  , "test_case_students"
                                  , "test_case_Ticket"
                                  , "test_case_Tour_guide"
                                  , "test_cases_all"
                                  ," All_Except_Actor_Arrival_Broker_except_first_three",
                                  " All_Except_Actor_Arrival_except_first_three",
                                  " All_Except_Actor_Broker_except_first_three",
                                  " All_Except_Actor_Employee_except_first_three",
                                  " All_Except_Actor_except_first_three",
                                  " All_Except_Arrival_Broker_Employee_except_first_three",
                                  " All_Except_Arrival_Broker_except_first_three",
                                  " All_Except_Arrival_Employee_except_first_three",
                                  " All_Except_Arrival_Footballer_except_first_three",
                                  " All_Except_Arrival_except_first_three",
                                  " All_Except_Broker_Employee_Footballer_except_first_three",
                                  " All_Except_Broker_Employee_except_first_three",
                                  " All_Except_Broker_Footballer_except_first_three",
                                  " All_Except_Broker_except_first_three",
                                  " All_Except_Employee_Footballer_movie_except_first_three",
                                  " All_Except_Employee_Footballer_except_first_three",
                                  " All_Except_Employee_except_first_three",
                                  " All_Except_Footballer_Movie_Scientist_except_first_three",
                                  " All_Except_Footballer_Movie_except_first_three",
                                  " All_Except_footballer_except_first_three",
                                  " All_Except_Movie_Scientist_except_first_three",
                                  " All_Except_Movie_except_first_three",
                                  " All_Except_Scientist_except_first_three",
                                  " Only_Actor",
                                  " Only_Arrival",
                                  " Only_Broker",
                                  " Only_Employee",
                                  " Only_Footballer",
                                  " Only_Movie",
                                  " Only_Scientist"};
            
            for (int i = 0; i < testCases.length; i++) {
            	 startTomcat(tomcatDir);
                Object testCase = testCases[i];
                String testCaseName = testCaseNames[i];

                Method method = testCase.getClass().getMethod("check_test");
                System.out.println("Executing test in " + testCaseName);
                method.invoke(testCase);
                
                shutdownTomcat(tomcatDir);
                
                
                executecommand();
                
                db_connection db_connection = new db_connection();
				db_connection.record_data(testCaseName);
				
				
				deletejacocoexec();
            }
            
              
			shutdownTomcat(tomcatDir);
    }
	public void startTomcat(String tomcatDir)
	{

        try {
            // Set the working directory to the Tomcat bin directory
            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "startup.bat");
            processBuilder.directory(new File(tomcatDir, "bin"));

            // Start the process
            Process process = processBuilder.start();

            // Optional: Wait for the process to complete
            process.waitFor();

            System.out.println("Tomcat server started successfully.");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
	}
	public void shutdownTomcat(String tomcatDir)
	{

		try {
		    // Set the working directory to the Tomcat bin directory
		    ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "shutdown.bat");
		    processBuilder.directory(new File(tomcatDir, "bin"));

		    // Start the process
		    Process process = processBuilder.start();

		    // Optional: Wait for the process to complete
		    process.waitFor();

		    System.out.println("Tomcat server shutdown successfully.");

		} catch (IOException | InterruptedException e) {
		    e.printStackTrace();
		}
	}
	public void executecommand() {
		 String jacocoDir = "D:\\apache-tomcat-9.0.76-windows-x64\\apache-tomcat-9.0.76\\jacoco";
		String command = "java -jar D:\\apache-tomcat-9.0.76-windows-x64\\apache-tomcat-9.0.76\\jacoco\\jacococli.jar report jacoco.exec --classfiles D:\\apache-tomcat-9.0.76-windows-x64\\apache-tomcat-9.0.76\\webapps\\Jacoco1\\WEB-INF\\classes --html D:\\apache-tomcat-9.0.76-windows-x64\\apache-tomcat-9.0.76\\jacoco\\report";

		try {
            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", command);
            processBuilder.directory(new File(jacocoDir));

            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Jacoco report generated successfully.");
            } else {
                System.err.println("Failed to generate Jacoco report. Exit code: " + exitCode);
            }

            // Read the output from the command
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
	}
	public void deletejacocoexec() {
		String filePath = "D:\\apache-tomcat-9.0.76-windows-x64\\apache-tomcat-9.0.76\\jacoco\\jacoco.exec";

        // Create a File object representing the file to be deleted
        File fileToDelete = new File(filePath);

        // Check if the file exists
        if (fileToDelete.exists()) {
            // Attempt to delete the file
            if (fileToDelete.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
	}

}
