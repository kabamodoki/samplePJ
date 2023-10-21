-- -----------------------------------------------
-- ユーザー作成                                  --
-- -----------------------------------------------

--applicationユーザ
CREATE ROLE applUser001 LOGIN
  PASSWORD 'applUser001'
NOSUPERUSER INHERIT NOCREATEDB NOCREATEROLE NOREPLICATION;
