package USBankMiniProject;

import java.util.HashMap;
import java.util.*;

public class UsBankDet {
	
USBankFileRead bankfileR= new USBankFileRead();
Scanner sc=new Scanner(System.in);

void loadData()
{
	bankfileR.fileLoader();
}

void complaintsBasedOnYear(String year)
{
	for (HashMap.Entry<String,ComplaintDetails> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
	{
		if(entry.getValue().dateReceived.contains(year))
			  { 
		  		System.out.println(entry.getValue().issue);
			  }
	}
	
}
	

	
	
	
void complaintsBasedOnCompany(String u_company)
{
for (HashMap.Entry<String,ComplaintDetails> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
{
  if(entry.getValue().company.equalsIgnoreCase(u_company))
  {
	  System.out.println(entry.getValue().issue + " "+ u_company);
  }
}
}

void complaintsBasedOnComplaintID(String id)
{
for (HashMap.Entry<String,ComplaintDetails> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
{
  if(bankfileR.GetMapBankobjcompdet().containsKey(id))
  {
	  System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
  }
  else
  {
	  	System.out.println("Complaint ID does not exists.");
	  
  }
}
}

void NoOfDaysTOCloseComplaint(String id)
{
	
}


void complaintsClosed(String uid)
{
for (HashMap.Entry<String,ComplaintDetails> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
{
	String compResp=entry.getValue().companyResponseToConsumer;
	
  if(compResp.equalsIgnoreCase("Closed") || compResp.equalsIgnoreCase("Closed with explanation"))
  {
	  System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
  }
  else
  {
	  	System.out.println("Complaint ID does not exists.");
	  
  }
}

}


void complaintsReceivingTimelyResponse(String id)
{
for (HashMap.Entry<String,ComplaintDetails> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
{
	if(entry.getValue().timelyResponse.equals("Yes"))
	{
		System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
	}
}
}

public UsBankDet() {
	super();
}
}
