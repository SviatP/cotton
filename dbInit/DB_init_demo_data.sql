use baglab;

insert into baglab.role (name, description) values ('Administrator', 'Administrator has permissions. Have to manage baglab system.');
insert into baglab.role (name, description) values ('Moderator', 'Have to help customer make a valid order');
insert into baglab.role (name, description) values ('Customer', 'Confihure and order product.');
insert into baglab.role (name, description) values ('Factory', 'Create products according to orders.');
insert into baglab.role (name, description) values ('Guest', 'Configure bags, view info.');

insert into baglab.user_status (code, description) values ('Active', 'Default status');
insert into baglab.user_status (code, description) values ('Inactive', 'User lost of permission');
insert into baglab.user_status (code, description) values ('Bane', 'User is banned');

insert into baglab.orderStatus (code, description) values ('accepted', 'order is accepted and send to factory');
insert into baglab.orderStatus (code, description) values ('processing', 'order is processing by moderator');
insert into baglab.orderStatus (code, description) values ('denied', 'order is denied by moderator');

insert into baglab.material (name, price) values ('cotton', 20.2);
insert into baglab.material (name, price) values ('jeans', 28.1);
insert into baglab.material (name, price) values ('leather', 38.5);


insert into baglab.user  (login,password,email, firstname, lastname, roleId) values ('admin','admin','admin@gmail.com',  'Ivan', 'Onobrenko',1);
insert into baglab.user  (login,password,email, firstname, lastname, roleId) values ('Anna','annaPass', 'demoanna@gmail.com',  'John', 'Doe', 2);
insert into baglab.user  (login,password,email, firstname, lastname, roleId) values ('Peter','peterthebest','peter86@mail.ru','Petruchio','Petrov', 3);
insert into baglab.user  (login,password,email, firstname, lastname, roleId) values ('Finn','demopass','finnthehuman@gmail.com', 'John','Doe2',4);
insert into baglab.user  (login,password,email, firstname, lastname, roleId) values ('Karla','pass','turk@gmail.com', 'John','Doe3',2);
insert into baglab.user  (login,password,email, firstname, lastname, roleId) values ('manager','passm','lao@', 'Lao','Dzi',4);
insert into baglab.user  (login,password,email, firstname, lastname, roleId) values ('manager2','passm','lao@2', 'Lao2','Dzi2',4);

insert into baglab.order (userId, orderStatusId) VALUES (1,1);
insert into baglab.order (userId, orderStatusId) VALUES (1,2);
insert into baglab.order (userId, orderStatusId) VALUES (1,2);
insert into baglab.order (userId, orderStatusId) VALUES (1,2);
insert into baglab.order (userId, orderStatusId) VALUES (2,1);
insert into baglab.order (userId, orderStatusId) VALUES (2,2);
insert into baglab.order (userId, orderStatusId) VALUES (3,1);
insert into baglab.order (userId, orderStatusId) VALUES (3,2);
insert into baglab.order (userId, orderStatusId) VALUES (3,2);
insert into baglab.order (userId, orderStatusId) VALUES (3,2);
insert into baglab.order (userId, orderStatusId) VALUES (3,3);
#------------------------------------------------------
insert into baglab.country (name) values ('Andorra');
insert into baglab.country (name) values ('United Arab Emirates');
insert into baglab.country (name) values ('Afghanistan');
insert into baglab.country (name) values ('Antigua and Barbuda');
insert into baglab.country (name) values ('Anguilla');
insert into baglab.country (name) values ('Albania');
insert into baglab.country (name) values ('Armenia');
insert into baglab.country (name) values ('Netherlands Antilles');
insert into baglab.country (name) values ('Angola');
insert into baglab.country (name) values ('Antarctica');
insert into baglab.country (name) values ('Argentina');
insert into baglab.country (name) values ('American Samoa');
insert into baglab.country (name) values ('Austria');
insert into baglab.country (name) values ('Australia');
insert into baglab.country (name) values ('Aruba');
insert into baglab.country (name) values ('Åland Islands');
insert into baglab.country (name) values ('Azerbaijan');
insert into baglab.country (name) values ('Bosnia and Herzegovina');
insert into baglab.country (name) values ('Barbados');
insert into baglab.country (name) values ('Bangladesh');
insert into baglab.country (name) values ('Belgium');
insert into baglab.country (name) values ('Burkina Faso');
insert into baglab.country (name) values ('Bulgaria');
insert into baglab.country (name) values ('Bahrain');
insert into baglab.country (name) values ('Burundi');
insert into baglab.country (name) values ('Benin');
insert into baglab.country (name) values ('Saint Barthélemy');
insert into baglab.country (name) values ('Bermuda');
insert into baglab.country (name) values ('Brunei');
insert into baglab.country (name) values ('Bolivia');
insert into baglab.country (name) values ('Bonaire, Sint Eustatius and Saba');
insert into baglab.country (name) values ('Brazil');
insert into baglab.country (name) values ('Bahamas');
insert into baglab.country (name) values ('Bhutan');
insert into baglab.country (name) values ('Bouvet Island');
insert into baglab.country (name) values ('Botswana');
insert into baglab.country (name) values ('Belarus');
insert into baglab.country (name) values ('Belize');
insert into baglab.country (name) values ('Canada');
insert into baglab.country (name) values ('Cocos Islands');
insert into baglab.country (name) values ('The Democratic Republic Of Congo');
insert into baglab.country (name) values ('Central African Republic');
insert into baglab.country (name) values ('Congo');
insert into baglab.country (name) values ('Switzerland');
insert into baglab.country (name) values ('Ivory Coast');
insert into baglab.country (name) values ('Cook Islands');
insert into baglab.country (name) values ('Chile');
insert into baglab.country (name) values ('Cameroon');
insert into baglab.country (name) values ('China');
insert into baglab.country (name) values ('Colombia');
insert into baglab.country (name) values ('Costa Rica');
insert into baglab.country (name) values ('Cuba');
insert into baglab.country (name) values ('Cape Verde');
insert into baglab.country (name) values ('Curaçao');
insert into baglab.country (name) values ('Christmas Island');
insert into baglab.country (name) values ('Cyprus');
insert into baglab.country (name) values ('Czech Republic');
insert into baglab.country (name) values ('Germany');
insert into baglab.country (name) values ('Djibouti');
insert into baglab.country (name) values ('Denmark');
insert into baglab.country (name) values ('Dominica');
insert into baglab.country (name) values ('Dominican Republic');
insert into baglab.country (name) values ('Algeria');
insert into baglab.country (name) values ('Ecuador');
insert into baglab.country (name) values ('Estonia');
insert into baglab.country (name) values ('Egypt');
insert into baglab.country (name) values ('Western Sahara');
insert into baglab.country (name) values ('Eritrea');
insert into baglab.country (name) values ('Spain');
insert into baglab.country (name) values ('Ethiopia');
insert into baglab.country (name) values ('Finland');
insert into baglab.country (name) values ('Fiji');
insert into baglab.country (name) values ('Falkland Islands');
insert into baglab.country (name) values ('Micronesia');
insert into baglab.country (name) values ('Faroe Islands');
insert into baglab.country (name) values ('France');
insert into baglab.country (name) values ('Gabon');
insert into baglab.country (name) values ('United Kingdom');
insert into baglab.country (name) values ('Grenada');
insert into baglab.country (name) values ('Georgia');
insert into baglab.country (name) values ('French Guiana');
insert into baglab.country (name) values ('Guernsey');
insert into baglab.country (name) values ('Ghana');
insert into baglab.country (name) values ('Gibraltar');
insert into baglab.country (name) values ('Greenland');
insert into baglab.country (name) values ('Gambia');
insert into baglab.country (name) values ('Guinea');
insert into baglab.country (name) values ('Guadeloupe');
insert into baglab.country (name) values ('Equatorial Guinea');
insert into baglab.country (name) values ('Greece');
insert into baglab.country (name) values ('South Georgia And The South Sandwich Islands');
insert into baglab.country (name) values ('Guatemala');
insert into baglab.country (name) values ('Guam');
insert into baglab.country (name) values ('Guinea-Bissau');
insert into baglab.country (name) values ('Guyana');
insert into baglab.country (name) values ('Hong Kong');
insert into baglab.country (name) values ('Heard Island And McDonald Islands');
insert into baglab.country (name) values ('Honduras');
insert into baglab.country (name) values ('Croatia');
insert into baglab.country (name) values ('Haiti');
insert into baglab.country (name) values ('Hungary');
insert into baglab.country (name) values ('Indonesia');
insert into baglab.country (name) values ('Ireland');
insert into baglab.country (name) values ('Israel');
insert into baglab.country (name) values ('Isle Of Man');
insert into baglab.country (name) values ('India');
insert into baglab.country (name) values ('British Indian Ocean Territory');
insert into baglab.country (name) values ('Iraq');
insert into baglab.country (name) values ('Iran');
insert into baglab.country (name) values ('Iceland');
insert into baglab.country (name) values ('Italy');
insert into baglab.country (name) values ('Jersey');
insert into baglab.country (name) values ('Jamaica');
insert into baglab.country (name) values ('Jordan');
insert into baglab.country (name) values ('Japan');
insert into baglab.country (name) values ('Kenya');
insert into baglab.country (name) values ('Kyrgyzstan');
insert into baglab.country (name) values ('Cambodia');
insert into baglab.country (name) values ('Kiribati');
insert into baglab.country (name) values ('Comoros');
insert into baglab.country (name) values ('Saint Kitts And Nevis');
insert into baglab.country (name) values ('North Korea');
insert into baglab.country (name) values ('South Korea');
insert into baglab.country (name) values ('Kuwait');
insert into baglab.country (name) values ('Cayman Islands');
insert into baglab.country (name) values ('Kazakhstan');
insert into baglab.country (name) values ('Laos');
insert into baglab.country (name) values ('Lebanon');
insert into baglab.country (name) values ('Saint Lucia');
insert into baglab.country (name) values ('Liechtenstein');
insert into baglab.country (name) values ('Sri Lanka');
insert into baglab.country (name) values ('Liberia');
insert into baglab.country (name) values ('Lesotho');
insert into baglab.country (name) values ('Lithuania');
insert into baglab.country (name) values ('Luxembourg');
insert into baglab.country (name) values ('Latvia');
insert into baglab.country (name) values ('Libya');
insert into baglab.country (name) values ('Morocco');
insert into baglab.country (name) values ('Monaco');
insert into baglab.country (name) values ('Moldova');
insert into baglab.country (name) values ('Montenegro');
insert into baglab.country (name) values ('Saint Martin');
insert into baglab.country (name) values ('Madagascar');
insert into baglab.country (name) values ('Marshall Islands');
insert into baglab.country (name) values ('Macedonia');
insert into baglab.country (name) values ('Mali');
insert into baglab.country (name) values ('Myanmar');
insert into baglab.country (name) values ('Mongolia');
insert into baglab.country (name) values ('Macao');
insert into baglab.country (name) values ('Northern Mariana Islands');
insert into baglab.country (name) values ('Martinique');
insert into baglab.country (name) values ('Mauritania');
insert into baglab.country (name) values ('Montserrat');
insert into baglab.country (name) values ('Malta');
insert into baglab.country (name) values ('Mauritius');
insert into baglab.country (name) values ('Maldives');
insert into baglab.country (name) values ('Malawi');
insert into baglab.country (name) values ('Mexico');
insert into baglab.country (name) values ('Malaysia');
insert into baglab.country (name) values ('Mozambique');
insert into baglab.country (name) values ('Namibia');
insert into baglab.country (name) values ('New Caledonia');
insert into baglab.country (name) values ('Niger');
insert into baglab.country (name) values ('Norfolk Island');
insert into baglab.country (name) values ('Nigeria');
insert into baglab.country (name) values ('Nicaragua');
insert into baglab.country (name) values ('Netherlands');
insert into baglab.country (name) values ('Norway');
insert into baglab.country (name) values ('Nepal');
insert into baglab.country (name) values ('Nauru');
insert into baglab.country (name) values ('Niue');
insert into baglab.country (name) values ('New Zealand');
insert into baglab.country (name) values ('Oman');
insert into baglab.country (name) values ('Panama');
insert into baglab.country (name) values ('Peru');
insert into baglab.country (name) values ('French Polynesia');
insert into baglab.country (name) values ('Papua New Guinea');
insert into baglab.country (name) values ('Philippines');
insert into baglab.country (name) values ('Pakistan');
insert into baglab.country (name) values ('Poland');
insert into baglab.country (name) values ('Saint Pierre And Miquelon');
insert into baglab.country (name) values ('Pitcairn');
insert into baglab.country (name) values ('Puerto Rico');
insert into baglab.country (name) values ('Palestine');
insert into baglab.country (name) values ('Portugal');
insert into baglab.country (name) values ('Palau');
insert into baglab.country (name) values ('Paraguay');
insert into baglab.country (name) values ('Qatar');
insert into baglab.country (name) values ('Reunion');
insert into baglab.country (name) values ('Romania');
insert into baglab.country (name) values ('Serbia');
insert into baglab.country (name) values ('Russia');
insert into baglab.country (name) values ('Rwanda');
insert into baglab.country (name) values ('Saudi Arabia');
insert into baglab.country (name) values ('Solomon Islands');
insert into baglab.country (name) values ('Seychelles');
insert into baglab.country (name) values ('Sudan');
insert into baglab.country (name) values ('Sweden');
insert into baglab.country (name) values ('Singapore');
insert into baglab.country (name) values ('Saint Helena');
insert into baglab.country (name) values ('Slovenia');
insert into baglab.country (name) values ('Svalbard And Jan Mayen');
insert into baglab.country (name) values ('Slovakia');
insert into baglab.country (name) values ('Sierra Leone');
insert into baglab.country (name) values ('San Marino');
insert into baglab.country (name) values ('Senegal');
insert into baglab.country (name) values ('Somalia');
insert into baglab.country (name) values ('Suriname');
insert into baglab.country (name) values ('South Sudan');
insert into baglab.country (name) values ('Sao Tome And Principe');
insert into baglab.country (name) values ('El Salvador');
insert into baglab.country (name) values ('Sint Maarten (Dutch part)');
insert into baglab.country (name) values ('Syria');
insert into baglab.country (name) values ('Swaziland');
insert into baglab.country (name) values ('Turks And Caicos Islands');
insert into baglab.country (name) values ('Chad');
insert into baglab.country (name) values ('French Southern Territories');
insert into baglab.country (name) values ('Togo');
insert into baglab.country (name) values ('Thailand');
insert into baglab.country (name) values ('Tajikistan');
insert into baglab.country (name) values ('Tokelau');
insert into baglab.country (name) values ('Timor-Leste');
insert into baglab.country (name) values ('Turkmenistan');
insert into baglab.country (name) values ('Tunisia');
insert into baglab.country (name) values ('Tonga');
insert into baglab.country (name) values ('Turkey');
insert into baglab.country (name) values ('Trinidad and Tobago');
insert into baglab.country (name) values ('Tuvalu');
insert into baglab.country (name) values ('Taiwan');
insert into baglab.country (name) values ('Tanzania');
insert into baglab.country (name) values ('Ukraine');
insert into baglab.country (name) values ('Uganda');
insert into baglab.country (name) values ('United States Minor Outlying Islands');
insert into baglab.country (name) values ('United States');
insert into baglab.country (name) values ('Uruguay');
insert into baglab.country (name) values ('Uzbekistan');
insert into baglab.country (name) values ('Vatican');
insert into baglab.country (name) values ('Saint Vincent And The Grenadines');
insert into baglab.country (name) values ('Venezuela');
insert into baglab.country (name) values ('British Virgin Islands');
insert into baglab.country (name) values ('U.S. Virgin Islands');
insert into baglab.country (name) values ('Vietnam');
insert into baglab.country (name) values ('Vanuatu');
insert into baglab.country (name) values ('Wallis And Futuna');
insert into baglab.country (name) values ('Samoa');
insert into baglab.country (name) values ('Yemen');
insert into baglab.country (name) values ('Mayotte');
insert into baglab.country (name) values ('South Africa');
insert into baglab.country (name) values ('Zambia');
insert into baglab.country (name) values ('Zimbabwe');

insert into baglab.shipping_adress (contactName, countryId, street, apartment, state, city, zipcode, mobile, userId) values ('Ivan Onobrenko',132,'Tkachenko','23','Kiev','Kiev','08187','+380683842905', 1);
insert into baglab.shipping_adress (contactName, countryId, street, apartment, state, city, zipcode, mobile, userId) values ('John Doe',135,'Main Avenu','3','Alabama', 'Calera','AL 35040','+1 205-668-0402', 2);

#-------------------------
insert into baglab.pages_type (type) VALUES ('ACTIVE');
insert into baglab.pages_type (type) VALUES ('ARCHIVE');
insert into baglab.pages_type (type) VALUES ('DELETED');


insert into baglab.pages (body, header, pagesTypeId) VALUES ('body 1', 'header1', '1');
insert into baglab.pages (body, header, pagesTypeId) VALUES ('body 2', 'header2', '1');
insert into baglab.pages (body, header, pagesTypeId) VALUES ('body ARCHIVE', 'header ARCHIVE', '2');
insert into baglab.pages (body, header, pagesTypeId) VALUES ('body DELETED', 'header DELETED', '3');