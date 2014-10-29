package id.co.skyforce.finance.controller;

import java.util.ArrayList;
import java.util.List;

import id.co.skyforce.finance.model.CIF;
import id.co.skyforce.finance.model.LoanAccount;
import id.co.skyforce.finance.service.CIFService;
import id.co.skyforce.finance.service.LoanAccountService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ViewLoanAccountController {
	private List<CIF> cifList = new ArrayList<CIF>();
	private CIF cif;
	private CIFService cifService = new CIFService();

	private String loanAccountNo;
	private List<LoanAccount> loanAccountList = new ArrayList<LoanAccount>();
	private LoanAccount loanAccount;
	private LoanAccountService loanAccountService = new LoanAccountService();

	public ViewLoanAccountController() {
		this.cifList = this.cifService.getAllCif();
		this.cif = this.cifList.get(0);
		this.loanAccountList = this.cif.getLoanAccounts();
	}

	public void retrieveLoanAccountList() throws Exception {
		this.loanAccountList = this.cif.getLoanAccounts();
	}

	public void retrieveLoanAccount() throws Exception {
		this.loanAccount = loanAccountService
				.getLoanAccount(this.loanAccountNo);
	}

	public List<CIF> getCifList() {
		return cifList;
	}

	public void setCifList(List<CIF> cifList) {
		this.cifList = cifList;
	}

	public CIF getCif() {
		return cif;
	}

	public void setCif(CIF cif) {
		this.cif = cif;
	}

	public CIFService getCifService() {
		return cifService;
	}

	public void setCifService(CIFService cifService) {
		this.cifService = cifService;
	}

	public String getLoanAccountNo() {
		return loanAccountNo;
	}

	public void setLoanAccountNo(String loanAccountNo) {
		this.loanAccountNo = loanAccountNo;
	}

	public List<LoanAccount> getLoanAccountList() {
		return loanAccountList;
	}

	public void setLoanAccountList(List<LoanAccount> loanAccountList) {
		this.loanAccountList = loanAccountList;
	}

	public LoanAccount getLoanAccount() {
		return loanAccount;
	}

	public void setLoanAccount(LoanAccount loanAccount) {
		this.loanAccount = loanAccount;
	}

	public LoanAccountService getLoanAccountService() {
		return loanAccountService;
	}

	public void setLoanAccountService(LoanAccountService loanAccountService) {
		this.loanAccountService = loanAccountService;
	}
}
