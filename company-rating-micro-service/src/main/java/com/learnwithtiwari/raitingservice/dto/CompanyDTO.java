package com.learnwithtiwari.raitingservice.dto;

public class CompanyDTO {
	
	private Long id;
	
    private String companyName;

    private String companyBusiness;

    private String companyOrigin;
    
    

    public CompanyDTO(String companyName, String companyBusiness, String companyOrigin) {
		super();
		this.companyName = companyName;
		this.companyBusiness = companyBusiness;
		this.companyOrigin = companyOrigin;
	}

    

	public Long getId() {
		return id;
	}


	public String getCompanyName() {
        return companyName;
    }

  
    public String getCompanyBusiness() {
		return companyBusiness;
	}

	public String getCompanyOrigin() {
		return companyOrigin;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyBusiness == null) ? 0 : companyBusiness.hashCode());
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((companyOrigin == null) ? 0 : companyOrigin.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyDTO other = (CompanyDTO) obj;
		if (companyBusiness == null) {
			if (other.companyBusiness != null)
				return false;
		} else if (!companyBusiness.equals(other.companyBusiness))
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (companyOrigin == null) {
			if (other.companyOrigin != null)
				return false;
		} else if (!companyOrigin.equals(other.companyOrigin))
			return false;
		return true;
	}


}
