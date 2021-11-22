
/*
SalaryIncrease.java
J Quinn
01 12 2020
*/


public class SalaryIncrease{


  //data members
  private String position;
  private double yearsWorked;
  private double salary;
  private double finalSalary; //output


  //constructors
  public SalaryIncrease(){
    position = "";
    yearsWorked = 0;
    salary = 0;
  }

  //setters
  public void setPosition(String position){
    this.position = position;
  }

  public void setYearsWorked(int yearsWorked){
    this.yearsWorked = yearsWorked;
  }

  public void setSalary(int salary){
    this.salary = salary;
  }


  //computer
  public void compute(){

    //manager
    if(position.equalsIgnoreCase("manager")){
		if(yearsWorked <= 6){
			salary = (salary*1.02);
		}
		else{
			salary = (salary*1.03);
		}
	}

    //team leader
    if(position.equalsIgnoreCase("team leader")){
      if(yearsWorked <= 6){
        salary = (salary*1.025);
      }
      else{
        salary = (salary*1.04);
      }
    }

    //software developer
    if(position.equalsIgnoreCase("software developer")){
      if(yearsWorked <= 6){
        salary = (salary*1.03);
      }
      else{
        salary = (salary*1.04);
      }
    }
    finalSalary = salary;

  }

	//getters
	public double getFinalSalary(){
		return finalSalary;
	}

}

