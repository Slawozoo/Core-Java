package json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSONFile {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.print("Enter the no. of employee: ");
		int n = scn.nextInt();
		List<Employee> empl = new ArrayList<Employee>(n);

		for (int i = 0; i < n; i++) {
			// Employee emp = new Employee();
			System.out.print("Enter id: ");
			emp.setId(scn.nextInt());
			System.out.print("Enter name: ");
			emp.setName(scn.next());
			System.out.print("Enter address: ");
			emp.setAddress(scn.next());
			System.out.print("Enter email: ");
			emp.setEmail(scn.next());

			empl.add(emp);
		}
//		for(int i =0; i< n;i++) {
//			List<Employee> employeList = empl.get(i).;
//			System.out.println(employeList);
//		}
		// First Employee
		JSONObject employeeDetails = new JSONObject();

//        for(int i =0; i< n;i++) {
		employeeDetails.put("ID", emp.getId());
		employeeDetails.put("Name", emp.getName());
		employeeDetails.put("Address", emp.getAddress());
		employeeDetails.put("Email", emp.getEmail());

		JSONObject employeeObject = new JSONObject();
		employeeObject.put("employee", employeeDetails);
//             employeeList.add(employeeObject);
//        }

		// JSONObject employeeObject = new JSONObject();
		// employeeObject.put("employee", employeeDetails);

		// Second Employee
		JSONObject employeeDetails2 = new JSONObject();
		employeeDetails2.put("firstName", "Brian");
		employeeDetails2.put("lastName", "Schultz");
		employeeDetails2.put("website", "example.com");

		JSONObject employeeObject2 = new JSONObject();
		employeeObject2.put("employee", employeeDetails2);

		// Add employees to list
		JSONArray employeeList = new JSONArray();
//        for(int i =0; i< n;i++) {
//        	employeeList.add(employeeObject);
//        }
		employeeList.add(employeeObject);
		employeeList.add(employeeObject2);

		// Write JSON file
		try (FileWriter file = new FileWriter("employees1.json")) {
			// We can write any JSONArray or JSONObject instance to the file
			file.write(employeeList.toJSONString());
			file.flush();
			System.out.println("sucess");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
