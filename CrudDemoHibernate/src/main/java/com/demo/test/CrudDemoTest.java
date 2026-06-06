package com.demo.test;
import java.util.*;

import com.demo.model.Address;
import com.demo.model.Person;
import com.demo.service.PersonService;
import com.demo.service.PersonServiceImpl;
public class CrudDemoTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		PersonService pservice = new PersonServiceImpl();
		
		do{
			System.out.println("1. add new Person");
			System.out.println("2. display Person");
			System.out.println("3. update Person");
			System.out.println("4. delete Person");
			System.out.println("5. add new Address");
			System.out.println("6. display Address");
			System.out.println("7. update Address");
			System.out.println("8. delete Address");
			System.out.println("9. add existing address to existing person");
			System.out.println("10. Remove one address from a person");
			System.out.println("11. Display all  Person");
			System.out.println("12. Find Persons by city");
			System.out.println("13. exit");
			
			System.out.println("Enter your Choice :");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1->{
				boolean status = pservice.addPerson();
				{
					if(status)
					{
						System.out.println("New Person Added Successfully");
					}
					else
					{
						System.out.println("Unable to Add New Person");
					}
				}
			}
			
			case 2->{
				System.out.println("Enter pid to Search");
				int id = sc.nextInt();
				Person p = pservice.displayPerson(id);
				{
					if(p!=null)
					{
						System.out.println(p.getPname()+p.getMobile());
					}
					else
					{
						System.out.println("Unable to find  Person");
					}
				}
			}
			
			case 3->{
				System.out.println("Enter pid to Update");
				int id = sc.nextInt();
				System.out.println("Enter name:");
				String n = sc.next();
				System.out.println("Enter Mobile:");
				String mob = sc.next();
				
				boolean status = pservice.updatePerson(id,n,mob);
				
				if(status)
				{
					System.out.println(id + "Updated Successfully");
				}else
				{
					System.out.println(id + "Not Found");
				}
			}
			
			case 4->{
				System.out.println("Enter Person ID :");
				int pid = sc.nextInt();
				
				boolean status = pservice.deleteById(pid);
				if(status)
				{
					System.out.println("Person Deleted Successfully");
				}else
				{
					System.out.println(pid + "Not Found");
				}
			}
			
			case 5->{
				boolean status = pservice.addAddress();
				{
					if(status)
					{
						System.out.println("New Address Added Successfully");
					}
					else
					{
						System.out.println("Unable to Add New Address");
					}
				}
			}
			
			case 6->{
				System.out.println("Enter Address ID to Search");
				int aid = sc.nextInt();
				Address a = pservice.displayAddress(aid);
				{
					if(a!=null)
					{
						System.out.println(a);
					}
					else
					{
						System.out.println("Unable to find Address");
					}
				}
			}
			
			case 7->{
				System.out.println("Enter aid to Update");
				int aid = sc.nextInt();
				System.out.println("Enter City:");
				String ct = sc.next();
				System.out.println("Enter State:");
				String st = sc.next();
				System.out.println("Enter Street:");
				String str = sc.next();
				
				boolean status = pservice.updateAddress(aid,ct,st,str);
				
				if(status)
				{
					System.out.println(aid + "Updated Successfully");
				}else
				{
					System.out.println(aid + "Not Found");
				}
			}
			
			case 8->{
				System.out.println("Enter Address ID :");
				int aid = sc.nextInt();
				
				boolean status = pservice.deleteAddressById(aid);
				if(status)
				{
					System.out.println("Address Deleted Successfully");
				}else
				{
					System.out.println(aid + "Not Found");
				}
			}
			
			case 9->{
				System.out.println("Enter Person id:");
				int pid = sc.nextInt();
				System.out.println("Enter Address id:");
				int aid = sc.nextInt();
				
				boolean status = pservice.addAddressToPerson(pid,aid);
				if(status)
				{
					System.out.println("Address Added to Person Successfully");
				}else
				{
					System.out.println("Not Found");
				}
			}
			
			case 10->{
				System.out.println("Enter Person id:");
				int pid = sc.nextInt();
				System.out.println("Enter Address id:");
				int aid = sc.nextInt();
				
				boolean status = pservice.removeAddressFromPerson(pid,aid);
				if(status)
				{
					System.out.println("Address removed from Person Successfully");
				}else
				{
					System.out.println("Not Found");
				}
			}
			
			case 11->{
				List<Person> plist = new ArrayList<>();
				plist = pservice.getAll();
				if(plist!=null)
				{
					plist.forEach(p->System.out.println(p.getPname() + "------>" + p.getMobile()));
				}
				else
				{
					System.out.println("List is Empty");
				}
			}
			
			case 12->{
				System.out.println("Enter A City :");
				String ct = sc.next();
				List<Person> plist = new ArrayList<>();
				plist = pservice.getAllByCity(ct);
				if(plist!=null)
				{
					for(Person p : plist)
					{
						System.out.println(p.getPname());
						
						for(Address a : p.getAddrset())
						{
							System.out.println(a.getCity());
						}
					}
				}
			}
			
			case 13->{
				System.out.println("Thank You For Visiting.......");
				sc.close();
			}
			
			default->{
				System.out.println("Wrong Choice");
			}
			
			}
		}while(choice!=13);

	}

}
