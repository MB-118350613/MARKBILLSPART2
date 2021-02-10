DROP TABLE "USERDATA";

CREATE TABLE "USERDATA"
(
"USER_ID" INT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),   
"EMAIL" VARCHAR(50), 
"PASSWORD" VARCHAR(50), 
"FNAME" VARCHAR(50),   
"LNAME" VARCHAR(50),
"USERTYPE" VARCHAR(10)
);
DROP TABLE "PRODUCTS";
CREATE TABLE "PRODUCTS"
(
"PRODUCT_ID" INT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
"NAME" VARCHAR(50),
"DESCRIPTION" VARCHAR(100),   
"PRICE" FLOAT, 
"IMAGE_LOCATION" VARCHAR(100),
"QUANTITY" VARCHAR(10),
"TYPE" VARCHAR(30)
); 

DROP TABLE "CATEGORIES";

CREATE TABLE "CATEGORIES"
(
"CATEGORY_ID" INT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
"TYPE" VARCHAR(50)

); 

DROP TABLE "PAYMENTS";

CREATE TABLE "PAYMENTS"
(
"PAYMENT_ID" INT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
"USER_ID" INT,
"TOTAL" FLOAT

); 
