package com.scylla.api.scyllaapi.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class AuditResults implements Serializable {
	
	public List<SvResult> combos = new ArrayList<SvResult>();

	public List<SvResult> getCombos() {
		return combos;
	}

	public void setCombos(List<SvResult> combos) {
		this.combos = combos;
	}
		

}
