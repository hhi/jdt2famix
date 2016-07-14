package org.moosetechnology.jdt2famix.samples.basic;

public class VariousAttributeAccesses {
	
	String attribute;
	String initializedAttribute = "initializedAttribute";
	
	public VariousAttributeAccesses(String attribute) {
		this.attribute = attribute;
	}

	public void readAccessThroughAssignment() {
		String localVariable = attribute;
	}

	public void readAccessThroughMethodInvocationReceiver() {
		attribute.toString();
	}
	
	public void readAccessThroughArgumentInConstructorInvocation() {
		new String(attribute);
	}

	public void readAccessThroughArgumentInMethodInvocation() {
		"attribute".equals(attribute);
	}
	
	public void writeAccessThroughAssignment() {
		attribute = "attribute";
	}
	
	public void readAccessThroughIf() {
		if (attribute == "attribute")
			return;
	}

	public void readAccessThroughSwitch() {
		//TODO
	}

	public void readAccessThroughFor() {
		//TODO
	}

	public void readAccessThroughDo() {
		//TODO
	}

	public void readAccessThroughWhile() {
		//TODO
	}

	
	public String readAccessThroughReturn() {
		return attribute;
	}
	
}