package com.zubiri.sequenceofchars;

public class SequenceOfChars implements CharSequence{
	private String charSequence="";
	
	
	public SequenceOfChars(String charSequence){
		this.charSequence=charSequence;
	}
	
	
	public String getCharSequence() {
		return this.charSequence;
	}
	public void setCharSequence(String newCharSequence) {
		this.charSequence=newCharSequence;
	}
	
	
	public int length(){
		return this.charSequence.length();
	}
	public CharSequence subSequence(int start, int end) {
		return this.charSequence.subSequence(start, end);
	}
	public char charAt(int index) {
		return this.charSequence.charAt(index);
	}
}