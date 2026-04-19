class CountryStore {

    Country[] countries = new Country[10];
    int index = 0;

    void save(Country country) 
	{
		System.out.println("Running save in CountryStore");
        if (country != null && index < this.countries.length) 
		{
            this.countries[this.index] = country;
			System.out.println("Country saved in the index: "+this.index);
            this.index++;
        } 
		else 
		{
            System.out.println("Cannot save country");
        }
    }

    Country findByName(String name) 
	{
		System.out.println("Running findByName in CountryStore");
        if (name != null) 
		{
            for (Country country : this.countries) 
			{
                if (country != null && name.equals(country.name)) 
				{
                    return country;
                }
            }
			System.out.println("Name is not found");
			return null;
        }
		else
		{
			System.out.println("Name cannot be null");
			return null;
		}
    }

    State findStateByStateName(String name) 
	{
		System.out.println("Running findStateByStateName in CountryStore");
        if (name != null) 
		{
            for (Country country : countries) 
			{
                if (country != null && country.states != null) 
				{
                    for (State state : country.states) 
					{
                        if (state != null && name.equals(state.name)) 
						{
                            return state;
                        }
                    }
                }
            }
			System.out.println("State is not found");
			return null;
        }
		else
		{
			System.out.println("Name cannot be null");
			return null;
		}
	}

    City[] findAllCityByStateName(String name) 
	{
		System.out.println("Running findAllCityByStateName in CountryStore");
        if (name != null) 
		{
            for (Country country : countries) 
			{
                if (country != null && country.states != null) 
				{
                    for (State state : country.states) 
					{
                        if (state != null && name.equals(state.name)) 
						{
                            City[] cities = new City[1];
                            cities[0] = state.city; 
                            return cities;
                        }
                    }
                }
            }
			System.out.println("State is not found");
			return null;
        }
		else
		{
			System.out.println("Name cannot be null");
			return null;
		}
    }

    int findNoOfDistrictsByCityName(String name) 
	{
		System.out.println("Running findNoOfDistrictsByCityName in CountryStore");
		if (name != null) 
		{
			for (Country country : countries) 
			{
				if (country != null && country.states != null) 
				{
					for (State state : country.states) 
					{
						if (state != null && state.city != null) 
						{
							if (name.equals(state.city.name)) 
							{
								return state.city.noOfDistrict;
							}
						}
					}
				}
			}
			System.out.println("Name not found");
			return 0;
		} 
		else 
		{
			System.out.println("Name is null");
			return 0;
		}
	}

    Country findByCollectorName(String collectorName) 
	{
		System.out.println("Running findByCollectorName in CountryStore");
        if (collectorName != null) 
		{
            for (Country country : countries) 
			{
                if (country != null && country.states != null) 
				{
                    for (State state : country.states) 
					{
                        if (state != null && state.city != null && state.city.districts != null) 
						{
                            for (District district : state.city.districts) 
							{
                                if (district != null && district.collector != null) 
								{
                                    if (collectorName.equals(district.collector.name)) 
									{
                                        return country;
                                    }
                                }
                            }
                        }
                    }
                }
            }
			System.out.println("Name is not found");
			return null;
        }
		else
		{
			System.out.println("Name is null");
			return null;
		}
    }
}