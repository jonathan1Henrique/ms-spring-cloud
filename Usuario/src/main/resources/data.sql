INSERT INTO tb_usuario (nome, email, senha) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$u.BoKt.yoSi19Ar4I8h1..NmGrXZKQndXoh4momsNcYDWvztvwMn2');
INSERT INTO tb_usuario (nome, email, senha) VALUES ('Leia Red', 'leia@gmail.com', '$$2a$10$u.BoKt.yoSi19Ar4I8h1..NmGrXZKQndXoh4momsNcYDWvztvwMn2');

INSERT INTO tb_autorizacao (autorizacao) VALUES ('ROLE_OPERADOR');
INSERT INTO tb_autorizacao (autorizacao) VALUES ('ROLE_ADMIN');

INSERT INTO tb_usuario_autorizacao (usuario_id, autorizacao_id) VALUES (1, 1);
INSERT INTO tb_usuario_autorizacao (usuario_id, autorizacao_id) VALUES (2, 1);
INSERT INTO tb_usuario_autorizacao (usuario_id, autorizacao_id) VALUES (2, 2);