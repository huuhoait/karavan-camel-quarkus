

//DEPS org.apache.camel:camel-bindy:3.20.6
//DEPS org.apache.camel.quarkus:camel-quarkus-bindy:2.16.0

//DEPS io.quarkus:quarkus-bom:2.11.2.Final@pom
//DEPS io.quarkus:quarkus-resteasy
//DEPS io.quarkus:quarkus-smallrye-openapi
//DEPS io.quarkus:quarkus-swagger-ui


import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ";")
public class S3 {
    @DataField(pos = 1)
    String ocrFront;
    @DataField(pos = 2)
    String ocrBack;
    @DataField(pos = 3)
    String ocrFace;
    @DataField(pos = 4)
    String ID_NO;
    @DataField(pos = 5)
    String ID_NAME;
    @DataField(pos = 6)
    String ID_BD;
    @DataField(pos = 7)
    String ADDRESS;
    @DataField(pos = 8)
    String MATCH_SCORE;
    @DataField(pos = 9)
    String RECORD_DATE_OCR_FRONT;
    


    String imageFrontLink;
        String imageBacktLink;
            String imageFaceLink;

    public String getOcrFront() {
        return ocrFront;
    }
    public void setOcrFront(String ocrFront) {
        this.ocrFront = ocrFront;
    }
    public String getOcrBack() {
        return ocrBack;
    }
    public void setOcrBack(String ocrBack) {
        this.ocrBack = ocrBack;
    }
    public String getOcrFace() {
        return ocrFace;
    }
    public void setOcrFace(String ocrFace) {
        this.ocrFace = ocrFace;
    }
    public String getID_NO() {
        return ID_NO;
    }
    public void setID_NO(String iD_NO) {
        ID_NO = iD_NO;
    }
    public String getID_NAME() {
        return ID_NAME;
    }
    public void setID_NAME(String iD_NAME) {
        ID_NAME = iD_NAME;
    }
    public String getID_BD() {
        return ID_BD;
    }
    public void setID_BD(String iD_BD) {
        ID_BD = iD_BD;
    }
    public String getADDRESS() {
        return ADDRESS;
    }
    public void setADDRESS(String aDDRESS) {
        ADDRESS = aDDRESS;
    }
    public String getMATCH_SCORE() {
        return MATCH_SCORE;
    }
    public void setMATCH_SCORE(String mATCH_SCORE) {
        MATCH_SCORE = mATCH_SCORE;
    }
    public String getRECORD_DATE_OCR_FRONT() {
        return RECORD_DATE_OCR_FRONT;
    }
    public void setRECORD_DATE_OCR_FRONT(String rECORD_DATE_OCR_FRONT) {
        RECORD_DATE_OCR_FRONT = rECORD_DATE_OCR_FRONT;
    }
    public String getImageFrontLink() {
        return imageFrontLink;
    }
    public void setImageFrontLink(String imageFrontLink) {
        this.imageFrontLink = imageFrontLink;
    }
    public String getImageBacktLink() {
        return imageBacktLink;
    }
    public void setImageBacktLink(String imageBacktLink) {
        this.imageBacktLink = imageBacktLink;
    }
    public String getImageFaceLink() {
        return imageFaceLink;
    }
    public void setImageFaceLink(String imageFaceLink) {
        this.imageFaceLink = imageFaceLink;
    }
    @Override
    public String toString() {
        return "S3 [ocrFront=" + ocrFront + ", ocrBack=" + ocrBack + ", ocrFace=" + ocrFace + ", ID_NO=" + ID_NO
                + ", ID_NAME=" + ID_NAME + ", ID_BD=" + ID_BD + ", ADDRESS=" + ADDRESS + ", MATCH_SCORE=" + MATCH_SCORE
                + ", RECORD_DATE_OCR_FRONT=" + RECORD_DATE_OCR_FRONT + ", imageFrontLink=" + imageFrontLink
                + ", imageBacktLink=" + imageBacktLink + ", imageFaceLink=" + imageFaceLink + "]";
    }


   
    


      

}
