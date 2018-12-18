package com.cnpiec.demo.model;

public class JR {
    private String accountId;
    private String journalId;
    private String code;
    private String issn;
    private String eissn;
    private String tla;
    private String fla;
    private int jan = 0;// 1
    private int feb = 0;// 2
    private int mar = 0;// 3
    private int apr = 0;// 4
    private int may = 0;// 5
    private int jun = 0;// 6
    private int jul = 0;// 7
    private int aug = 0;// 8
    private int sep = 0;// 9
    private int oct = 0;// 10
    private int nov = 0;// 11
    private int dec = 0;// 12
    private int ytdTotal = 0;
    private int ytdHtml = 0;
    private int ytdPdf = 0;
    private String separator = "\t";// 分隔符
    // JR2拒访信息(无权限||有权限触发访问规则)
    private String accessDeniedCategory;
    private String uSageMonth;// 统计时间(年月)
    private String yearOfPublication;// 统计时间(年)

    public String getuSageMonth() {
        return uSageMonth;
    }

    public void setuSageMonth(String uSageMonth) {
        this.uSageMonth = uSageMonth;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getAccessDeniedCategory() {
        return accessDeniedCategory;
    }

    public void setAccessDeniedCategory(String accessDeniedCategory) {
        this.accessDeniedCategory = accessDeniedCategory;
    }

    public String getJournalId() {
        return journalId;
    }

    public void setJournalId(String journalId) {
        this.journalId = journalId;
    }

    public int getYtdTotal() {
        return ytdHtml + ytdPdf;
    }

    public void setYtdTotal(int ytdTotal) {
        this.ytdTotal = ytdHtml + ytdPdf;
    }

    public int getYtdHtml() {
        return ytdHtml;
    }

    public void setYtdHtml(int ytdHtml) {
        this.ytdHtml = ytdHtml;
    }

    public int getYtdPdf() {
        return ytdPdf;
    }

    public void setYtdPdf(int ytdPdf) {
        this.ytdPdf = ytdPdf;
    }

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public int getJan() {
        return jan;
    }

    public void setJan(int jan) {
        this.jan = jan;
    }

    public int getFeb() {
        return feb;
    }

    public void setFeb(int feb) {
        this.feb = feb;
    }

    public int getMar() {
        return mar;
    }

    public void setMar(int mar) {
        this.mar = mar;
    }

    public int getApr() {
        return apr;
    }

    public void setApr(int apr) {
        this.apr = apr;
    }

    public int getMay() {
        return may;
    }

    public void setMay(int may) {
        this.may = may;
    }

    public int getJun() {
        return jun;
    }

    public void setJun(int jun) {
        this.jun = jun;
    }

    public int getJul() {
        return jul;
    }

    public void setJul(int jul) {
        this.jul = jul;
    }

    public int getAug() {
        return aug;
    }

    public void setAug(int aug) {
        this.aug = aug;
    }

    public int getSep() {
        return sep;
    }

    public void setSep(int sep) {
        this.sep = sep;
    }

    public int getOct() {
        return oct;
    }

    public void setOct(int oct) {
        this.oct = oct;
    }

    public int getNov() {
        return nov;
    }

    public void setNov(int nov) {
        this.nov = nov;
    }

    public int getDec() {
        return dec;
    }

    public void setDec(int dec) {
        this.dec = dec;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getEissn() {
        return eissn;
    }

    public void setEissn(String eissn) {
        this.eissn = eissn;
    }

    public String getTla() {
        return tla;
    }

    public void setTla(String tla) {
        this.tla = tla;
    }

    public String getFla() {
        return fla;
    }

    public void setFla(String fla) {
        this.fla = fla;
    }

    public static String getJR1Header(String separator) {
        return "Subscriber ID" + separator + "Title Code" + separator + "ISSN" + separator + "eISSN" + separator
                + "Journal Code" + separator + "Journal Alt Code" + separator + "Jan" + separator + "Feb" + separator
                + "Mar" + separator + "Apr" + separator + "May" + separator + "Jun" + separator + "Jul" + separator
                + "Aug" + separator + "Sep" + separator + "Oct" + separator + "Nov" + separator + "Dec" + separator
                + "YTD Total" + separator + "YTD HTML" + separator + "YTD PDF";
    }

    public static String getJR1aHeader(String separator) {
        return "Subscriber ID" + separator + "Title Code" + separator + "ISSN" + separator + "eISSN" + separator
                + "Journal Code" + separator + "Journal Alt Code" + separator + "Jan" + separator + "Feb" + separator
                + "Mar" + separator + "Apr" + separator + "May" + separator + "Jun" + separator + "Jul" + separator
                + "Aug" + separator + "Sep" + separator + "Oct" + separator + "Nov" + separator + "Dec" + separator
                + "YTD Total" + separator + "YTD HTML" + separator + "YTD PDF";
    }

    public static String getJR2Header(String separator) {
        return "Subscriber ID" + separator + "Title Code" + separator + "ISSN" + separator + "eISSN" + separator
                + "Journal Code" + separator + "Journal Alt Code" + separator + "Access Denied Category" + separator
                + "Jan" + separator + "Feb" + separator + "Mar" + separator + "Apr" + separator + "May" + separator
                + "Jun" + separator + "Jul" + separator + "Aug" + separator + "Sep" + separator + "Oct" + separator
                + "Nov" + separator + "Dec" + separator + "YTD Total";
    }

    public static String getJR5Header(String separator) {
        return "Subscriber ID" + separator + "Title Code" + separator + "ISSN" + separator + "eISSN" + separator
                + "Journal Code" + separator + "Journal Alt Code" + separator + "Usage Month" + separator + "YOP"
                + separator + "Total Usage";
    }

    public String toJR1String() {
        return getAccountId() + this.separator + getCode() + this.separator + getIssn() + this.separator + getEissn()
                + this.separator + getFla() + this.separator + getTla() + this.separator + getJan() + this.separator
                + getFeb() + this.separator + getMar() + this.separator + getApr() + this.separator + getMay()
                + this.separator + getJun() + this.separator + getJul() + this.separator + getAug() + this.separator
                + getSep() + this.separator + getOct() + this.separator + getNov() + this.separator + getDec()
                + this.separator + getYtdTotal() + this.separator + getYtdHtml() + this.separator + getYtdPdf();
    }

    public String toJR1aString() {
        return getAccountId() + this.separator + getCode() + this.separator + getIssn() + this.separator + getEissn()
                + this.separator + getFla() + this.separator + getTla() + this.separator + getJan() + this.separator
                + getFeb() + this.separator + getMar() + this.separator + getApr() + this.separator + getMay()
                + this.separator + getJun() + this.separator + getJul() + this.separator + getAug() + this.separator
                + getSep() + this.separator + getOct() + this.separator + getNov() + this.separator + getDec()
                + this.separator + getYtdTotal() + this.separator + getYtdHtml() + this.separator + getYtdPdf();
    }

    public String toJR2String() {
        return getAccountId() + this.separator + getCode() + this.separator + getIssn() + this.separator + getEissn()
                + this.separator + getFla() + this.separator + getTla() + this.separator + getAccessDeniedCategory()
                + this.separator + this.separator + getJan() + this.separator + getFeb() + this.separator + getMar()
                + this.separator + getApr() + this.separator + getMay() + this.separator + getJun() + this.separator
                + getJul() + this.separator + getAug() + this.separator + getSep() + this.separator + getOct()
                + this.separator + getNov() + this.separator + getDec() + this.separator + getYtdTotal();
    }

    public String toJR5String() {
        return getAccountId() + this.separator + getCode() + this.separator + getIssn() + this.separator + getEissn()
                + this.separator + getFla() + this.separator + getTla() + this.separator + getuSageMonth()
                + this.separator + getYearOfPublication() + this.separator + getYtdTotal();
    }

    @Override
    public String toString() {
        return "JR [accountId=" + accountId + ", journalId=" + journalId + ", code=" + code + ", issn=" + issn
                + ", eissn=" + eissn + ", tla=" + tla + ", fla=" + fla + ", jan=" + jan + ", feb=" + feb + ", mar="
                + mar + ", apr=" + apr + ", may=" + may + ", jun=" + jun + ", jul=" + jul + ", aug=" + aug + ", sep="
                + sep + ", oct=" + oct + ", nov=" + nov + ", dec=" + dec + ", ytdTotal=" + ytdTotal + ", ytdHtml="
                + ytdHtml + ", ytdPdf=" + ytdPdf + ", separator=" + separator + "]";
    }

}
