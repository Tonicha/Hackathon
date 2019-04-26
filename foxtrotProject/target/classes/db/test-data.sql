DELETE FROM CUSTOMER;
INSERT INTO CUSTOMER(ID, CREATIONTIME, UPDATETIME, VERSION, EMAIL, PASSWORD, USERNAME) VALUES
  (1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0, '6969@gmail.com', '12312', 'ruben'),
  (2, TIMESTAMP '2017-10-10 08:45:56.481', TIMESTAMP '2017-10-10 08:45:56.481', 0, '9696@gmail.com', '54321', 'guilherme'),
  (3, TIMESTAMP '2017-10-10 08:45:56.482', TIMESTAMP '2017-10-10 08:45:56.482', 0, 'blingbling@gmail.com', 'sopa', 'jonatas'),
  (4, TIMESTAMP '2017-10-10 08:45:56.482', TIMESTAMP '2017-10-10 08:45:56.482', 0, 'cenas@gmail.com', 'barbas', 'luis'),
  (5, TIMESTAMP '2017-10-10 08:45:57.482', TIMESTAMP '2017-10-10 08:45:56.482', 0, 'kek@gmail.com', '123123', 'tonicha');

DELETE FROM RECIPE;
INSERT INTO RECIPE(ID, CREATIONTIME, UPDATETIME, VERSION, NAME, DESCRIPTION, INGREDIENTS) VALUES
  (1, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 2, 'bacalhau com alho', 'cenas', 'bacalhau', 'alho'),
  (2, TIMESTAMP '2017-10-10 10:23:02.194', TIMESTAMP '2017-10-10 10:23:19.801', 1, 'lasanha doce', 'vai o forno e prontes', 'massa', 'bechamel', 'chocolate'),
  (3, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 2, 'mix enlatado em arroz', 'tudo o que seja enlatado', 'cogumelos', 'milho', 'atum', 'ketchup'),
  (4, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 3, 'pao com esteroides', 'papo seco com extras', 'papo seco', 'chocolate', 'ketchup');

