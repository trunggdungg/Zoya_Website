mvn -pl . clean install & ^
mvn -pl techmaster-sdk clean install & ^
mvn -pl techmaster-admin-plugin clean install -Pexport,\!test & ^
mvn -pl techmaster-web-plugin clean install -Pexport,\!test & ^
mvn -pl techmaster-theme clean install -Pexport,\!test & ^
ezy.bat package & ^
ezy.bat export
