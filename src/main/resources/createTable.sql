CREATE TABLE OurUser (
  our_user_id serial primary key,
  name varchar(50) not null,
  fisrt_name varchar(50) not null,
  create_date date
);

CREATE TABLE Chat (
  chat_id serial primary key,
  creator int REFERENCES OurUser(our_user_id),
  title varchar(50) not null,
  create_date date
);

CREATE TABLE Chat_OurUser (
  chat_id int REFERENCES Chat(chat_id),
  our_user_id int REFERENCES OurUser(our_user_id)
);

CREATE TABLE Message (
  message_id serial primary key,
  chat_id int REFERENCES Chat(chat_id),
  message varchar(50) not null,
  author int not null,
  create_date date
);
