CREATE TABLE todos (
	id int8 PRIMARY KEY NOT NULL,
	"title" varchar NOT NULL,
	"description" varchar NOT NULL,
	"created_at" date NOT NULL,
	"completed_at" date
);