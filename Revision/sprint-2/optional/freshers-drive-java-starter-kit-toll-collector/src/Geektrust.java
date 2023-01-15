import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.geektrust.Toll;
import com.geektrust.model.Bus;
import com.geektrust.model.Car;
import com.geektrust.model.Motorbike;
import com.geektrust.model.Rickshaw;
import com.geektrust.model.Scooter;
import com.geektrust.model.Truck;
import com.geektrust.model.Van;
import com.geektrust.model.Vehicle;

public class Geektrust {
    
	//Initiating toll class with the parameterized constructor with their initial value
	public static Toll toll = new Toll(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    
	//To store vehicle with their FASTAG initial amount
	public static List<Vehicle> list = new ArrayList<>();
    
	//To calculate the total amount for each vehicle type and total amount, total amount by FASTAG,total amount by
	//cash, total discount
	public static Integer calculateVehicleAmount(String[] str) {
         
		//To get the amount collected by vehicle type
		Integer amount = 0;
         
		//To keep track, if the vehicle is already present in the list or not
		boolean flag = false;
         
		for (Vehicle v : list) {
            
			//if vehicle present in the list
			if (v.getVehicle_Number().equals(str[2])) {
                
				flag = true;

				if (v.isReturnJourney() == false) {
					if (v.getFastag_balance() >= v.getToll_Charge()) {

						v.setFastag_balance(v.getFastag_balance() - v.getToll_Charge());

						v.setReturnJourney(true);

						toll.setFastag_Amount(toll.getFastag_Amount() + v.getToll_Charge());

						amount = v.getToll_Charge();

						return amount;

					} else {
						if (v.getFastag_balance() > 0 && v.getFastag_balance() < v.getToll_Charge()) {

							Integer rem_amount = Math.abs(v.getFastag_balance() - v.getToll_Charge());

							toll.setFastag_Amount(toll.getFastag_Amount() + v.getFastag_balance());

							toll.setCash_Amount(toll.getCash_Amount() + rem_amount + 40);

							v.setFastag_balance(0);

							v.setReturnJourney(true);

							amount = v.getToll_Charge() + 40;

							return amount;

						} else if (v.getFastag_balance() == 0) {

							toll.setCash_Amount(toll.getCash_Amount() + v.getToll_Charge() + 40);

							v.setReturnJourney(true);

							amount = v.getToll_Charge() + 40;

							return amount;
						}
					}
				} else if (v.isReturnJourney() == true) {

					if (v.getFastag_balance() >= (v.getToll_Charge() / 2)) {

						v.setFastag_balance(v.getFastag_balance() - (v.getToll_Charge() / 2));

						v.setReturnJourney(false);

						toll.setFastag_Amount(toll.getFastag_Amount() + (v.getToll_Charge() / 2));

						toll.setDiscount(toll.getDiscount() + (v.getToll_Charge() / 2));

						amount = v.getToll_Charge() / 2;

						return amount;

					} else {
						if (v.getFastag_balance() > 0 && v.getFastag_balance() < (v.getToll_Charge() / 2)) {

							Integer rem_amount = Math.abs(v.getFastag_balance() - (v.getToll_Charge() / 2));

							toll.setFastag_Amount(toll.getFastag_Amount() + v.getToll_Charge());

							toll.setCash_Amount(toll.getCash_Amount() + rem_amount + 40);

							v.setFastag_balance(0);

							v.setReturnJourney(false);

							toll.setDiscount(toll.getDiscount() + (v.getToll_Charge() / 2));

							amount = v.getToll_Charge() / 2 + 40;

							return amount;

						}

						else if (v.getFastag_balance() == 0) {

							toll.setCash_Amount(toll.getCash_Amount() + (v.getToll_Charge() / 2) + 40);

							v.setReturnJourney(false);

							toll.setDiscount(toll.getDiscount() + (v.getToll_Charge() / 2));

							amount = v.getToll_Charge() / 2 + 40;

							return amount;

						}
					}

				}

			}

		}

		if (flag == false) {

			if (str[1].equals("CAR")) {

				Vehicle v = new Car();

				v.setFastag_balance(0);

				v.setVehicle_Number(str[2]);

				v.setReturnJourney(true);

				list.add(v);

				toll.setCash_Amount(toll.getCash_Amount() + v.getToll_Charge() + 40);

				amount = v.getToll_Charge() + 40;

				return amount;

			}

			else if (str[1].equals("BUS")) {

				Vehicle v = new Bus();

				v.setFastag_balance(0);

				v.setVehicle_Number(str[2]);

				v.setReturnJourney(true);

				list.add(v);

				toll.setCash_Amount(toll.getCash_Amount() + v.getToll_Charge() + 40);

				amount = v.getToll_Charge() + 40;

				return amount;

			}

			else if (str[1].equals("TRUCK")) {

				Vehicle v = new Truck();

				v.setFastag_balance(0);

				v.setVehicle_Number(str[2]);

				v.setReturnJourney(true);

				list.add(v);

				toll.setCash_Amount(toll.getCash_Amount() + v.getToll_Charge() + 40);

				amount = v.getToll_Charge() + 40;

				return amount;

			}

			else if (str[1].equals("MOTORBIKE")) {

				Vehicle v = new Motorbike();

				v.setFastag_balance(0);

				v.setVehicle_Number(str[2]);

				v.setReturnJourney(true);

				list.add(v);

				toll.setCash_Amount(toll.getCash_Amount() + v.getToll_Charge() + 40);

				amount = v.getToll_Charge() + 40;

				return amount;

			}

			else if (str[1].equals("VAN")) {

				Vehicle v = new Van();

				v.setFastag_balance(0);

				v.setVehicle_Number(str[2]);

				v.setReturnJourney(true);

				list.add(v);

				toll.setCash_Amount(toll.getCash_Amount() + v.getToll_Charge() + 40);

				amount = v.getToll_Charge() + 40;

				return amount;

			}

			else if (str[1].equals("SCOOTER")) {

				Vehicle v = new Scooter();

				v.setFastag_balance(0);

				v.setVehicle_Number(str[2]);

				v.setReturnJourney(true);

				list.add(v);

				toll.setCash_Amount(toll.getCash_Amount() + v.getToll_Charge() + 40);

				amount = v.getToll_Charge() + 40;

				return amount;

			}

			else if (str[1].equals("RICKSHAW")) {

				Vehicle v = new Rickshaw();

				v.setFastag_balance(0);

				v.setVehicle_Number(str[2]);

				v.setReturnJourney(true);

				list.add(v);

				toll.setCash_Amount(toll.getCash_Amount() + v.getToll_Charge() + 40);

				amount = v.getToll_Charge() + 40;

				return amount;

			}

		}

		return amount;

	}

	public static void main(String[] args) {

		try {
			// the file to be opened for reading
			FileInputStream fis = new FileInputStream(args[0]);
			Scanner sc = new Scanner(fis); // file to be scanned
			// returns true if there is another line to read

			while (sc.hasNextLine()) {
				String inputCommand = sc.nextLine();
				// Add your code here to process input commands.

				String[] str = inputCommand.split(" ");

				if (str[0].equals("FASTAG")) {

					Vehicle vehicle = null;

					char vehicle_type = str[1].charAt(0);

					switch (vehicle_type) {

					case 'B':
						vehicle = new Bus();

						vehicle.setFastag_balance(Integer.parseInt(str[2]));

						vehicle.setVehicle_Number(str[1]);

						vehicle.setReturnJourney(false);

						list.add(vehicle);

						break;

					case 'T':
						vehicle = new Truck();

						vehicle.setFastag_balance(Integer.parseInt(str[2]));

						vehicle.setVehicle_Number(str[1]);

						vehicle.setReturnJourney(false);

						list.add(vehicle);

						break;

					case 'C':
						vehicle = new Car();

						vehicle.setFastag_balance(Integer.parseInt(str[2]));

						vehicle.setVehicle_Number(str[1]);

						vehicle.setReturnJourney(false);

						list.add(vehicle);

						break;

					case 'R':
						vehicle = new Rickshaw();

						vehicle.setFastag_balance(Integer.parseInt(str[2]));

						vehicle.setVehicle_Number(str[1]);

						vehicle.setReturnJourney(false);

						list.add(vehicle);

						break;

					case 'M':
						vehicle = new Motorbike();

						vehicle.setFastag_balance(Integer.parseInt(str[2]));

						vehicle.setVehicle_Number(str[1]);

						vehicle.setReturnJourney(false);

						list.add(vehicle);

						break;

					case 'V':
						vehicle = new Van();

						vehicle.setFastag_balance(Integer.parseInt(str[2]));

						vehicle.setVehicle_Number(str[1]);

						vehicle.setReturnJourney(false);

						list.add(vehicle);

						break;

					case 'S':
						vehicle = new Scooter();

						vehicle.setFastag_balance(Integer.parseInt(str[2]));

						vehicle.setVehicle_Number(str[1]);

						vehicle.setReturnJourney(false);

						list.add(vehicle);

						break;

					}

				} else if (str[0].equals("COLLECT_TOLL")) {

					if (str[1].equals("TRUCK")) {
						toll.setTruck(toll.getTruck() + 1);

						Integer amount = calculateVehicleAmount(str);

						toll.setTruck_amount(toll.getTruck_amount() + amount);
					} else if (str[1].equals("BUS")) {
						toll.setBus(toll.getBus() + 1);

						Integer amount = calculateVehicleAmount(str);

						toll.setBus_amount(toll.getBus_amount() + amount);

					} else if (str[1].equals("CAR")) {
						toll.setCar(toll.getCar() + 1);

						Integer amount = calculateVehicleAmount(str);

						toll.setCar_amount(toll.getCar_amount() + amount);
					} else if (str[1].equals("MOTORBIKE")) {
						toll.setMotorbike(toll.getMotorbike() + 1);

						Integer amount = calculateVehicleAmount(str);

						toll.setMotorbike_amount(toll.getMotorbike_amount() + amount);
					} else if (str[1].equals("VAN")) {
						toll.setVan(toll.getVan() + 1);

						Integer amount = calculateVehicleAmount(str);

						toll.setVan_amount(toll.getVan_amount() + amount);
					} else if (str[1].equals("SCOOTER")) {
						toll.setScooter(toll.getScooter() + 1);

						Integer amount = calculateVehicleAmount(str);

						toll.setScooter_amount(toll.getScooter_amount() + amount);
					} else if (str[1].equals("RICKSHAW")) {
						toll.setRickshaw(toll.getRickshaw() + 1);

						Integer amount = calculateVehicleAmount(str);

						toll.setRickshaw_amount(toll.getRickshaw_amount() + amount);
					}

				} else {
					// process the input command and get the output
					// Once it is processed print the output using the command System.out.println()

					toll.setTotal_Amount(toll.getFastag_Amount() + toll.getCash_Amount());

					System.out.println("TOTAL_COLLECTION" + " " + toll.getTotal_Amount() + " " + toll.getDiscount());

					System.out.println("PAYMENT_SUMMARY" + " " + toll.getFastag_Amount() + " " + toll.getCash_Amount());

					System.out.println("VEHICLE_TYPE_SUMMARY");

					String[] vehicle_type = { "BUS", "CAR", "MOTORBIKE", "RICKSHAW", "SCOOTER", "TRUCK", "VAN" };

					Integer[] TotalCost_VehicalType = { toll.getBus_amount(), toll.getCar_amount(),
							toll.getMotorbike_amount(), toll.getRickshaw_amount(), toll.getScooter_amount(),
							toll.getTruck_amount(), toll.getVan_amount() };

					for (int i = 0; i < TotalCost_VehicalType.length - 1; i++) {
						for (int j = 0; j < TotalCost_VehicalType.length - i - 1; j++) {
							if (TotalCost_VehicalType[j] < TotalCost_VehicalType[j + 1]) {

								Integer temp = TotalCost_VehicalType[j];
								TotalCost_VehicalType[j] = TotalCost_VehicalType[j + 1];
								TotalCost_VehicalType[j + 1] = temp;

								String temp1 = vehicle_type[j];
								vehicle_type[j] = vehicle_type[j + 1];
								vehicle_type[j + 1] = temp1;
							}
						}
					}

					for (int i = 0; i < TotalCost_VehicalType.length; i++) {
						if (TotalCost_VehicalType[i] > 0) {
							if (vehicle_type[i].equals("BUS")) {
								System.out.println(vehicle_type[i] + " " + toll.getBus());
							} else if (vehicle_type[i].equals("CAR")) {
								System.out.println(vehicle_type[i] + " " + toll.getCar());
							}

							else if (vehicle_type[i].equals("TRUCK")) {
								System.out.println(vehicle_type[i] + " " + toll.getTruck());
							}

							else if (vehicle_type[i].equals("MOTORBIKE")) {
								System.out.println(vehicle_type[i] + " " + toll.getMotorbike());
							}

							else if (vehicle_type[i].equals("VAN")) {
								System.out.println(vehicle_type[i] + " " + toll.getVan());
							}

							else if (vehicle_type[i].equals("SCOOTER")) {
								System.out.println(vehicle_type[i] + " " + toll.getScooter());
							}

							else if (vehicle_type[i].equals("RICKSHAW")) {
								System.out.println(vehicle_type[i] + " " + toll.getRickshaw());
							}
						}
					}

				}
			}
			sc.close(); // closes the scanner
		} catch (IOException e) {
		}
	}
}
