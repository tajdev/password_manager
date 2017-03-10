package com.ibexsys.pwd.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Password-Criteria")
@XmlAccessorType(XmlAccessType.FIELD)
public class PasswordCriteria{

    public static final String ALPHA_CHARS_UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String ALPHA_CHARS_LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMERIC_CHARS = "0123456789";
    public static final String OTHER_CHARS = "!@#$%^&*()_+<>?{}[]|*-";
    public static final int DEFAULT_LEN = 8;
	
		
	private int pwdLen = DEFAULT_LEN;

	private boolean alphaUpperChars = true;
	private boolean alphaLowerChars = true;
	private boolean numericChars = true;
	private boolean isOtherChars = true;

	@XmlElement(name = "pwd-length")
	public int getPwdLen() {
		return pwdLen;
	}


	public void setPwdLen(int pwdLen) {
		this.pwdLen = pwdLen;
	}

	@XmlElement
	public boolean isAlphaUpperChars() {
		return alphaUpperChars;
	}


	public void setAlphaUpperChars(boolean alphaUpperChars) {
		this.alphaUpperChars = alphaUpperChars;
	}

	@XmlElement
	public boolean isAlphaLowerChars() {
		return alphaLowerChars;
	}

	public void setAlphaLowerChars(boolean alphaLowerChars) {
		this.alphaLowerChars = alphaLowerChars;
	}
	
	@XmlElement
	public boolean isNumericChars() {
		return numericChars;
	}

	public void setNumericChars(boolean numericChars) {
		this.numericChars = numericChars;
	}
	
	@XmlElement
	public boolean isOtherChars() {
		return isOtherChars;
	}
	/**
	 * @param isOtherChars the isOtherChars to set
	 */
	public void setOtherChars(boolean isOtherChars) {
		this.isOtherChars = isOtherChars;
	}
	/**
	 * @return the alphaCharsUpperCase
	 */
	public static String getAlphaCharsUpperCase() {
		return ALPHA_CHARS_UPPER_CASE;
	}
	/**
	 * @return the alphaCharsLowerCase
	 */
	public static String getAlphaCharsLowerCase() {
		return ALPHA_CHARS_LOWER_CASE;
	}
	/**
	 * @return the numericChars
	 */
	public static String getNumericChars() {
		return NUMERIC_CHARS;
	}
	/**
	 * @return the otherChars
	 */
	public static String getOtherChars() {
		return OTHER_CHARS;
	}
	/**
	 * @return the defaultLen
	 */
	public static int getDefaultLen() {
		return DEFAULT_LEN;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (alphaLowerChars ? 1231 : 1237);
		result = prime * result + (alphaUpperChars ? 1231 : 1237);
		result = prime * result + (isOtherChars ? 1231 : 1237);
		result = prime * result + (numericChars ? 1231 : 1237);
		result = prime * result + pwdLen;
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
		PasswordCriteria other = (PasswordCriteria) obj;
		if (alphaLowerChars != other.alphaLowerChars)
			return false;
		if (alphaUpperChars != other.alphaUpperChars)
			return false;
		if (isOtherChars != other.isOtherChars)
			return false;
		if (numericChars != other.numericChars)
			return false;
		if (pwdLen != other.pwdLen)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PasswordCriteria [pwdLen=" + pwdLen + ", alphaUpperChars=" + alphaUpperChars + ", alphaLowerChars="
				+ alphaLowerChars + ", numericChars=" + numericChars + ", isOtherChars=" + isOtherChars + "]";
	}



}
