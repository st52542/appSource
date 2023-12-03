-- Create users and set passwords
CREATE USER 'techSource'@'%' IDENTIFIED BY 'techSource';

-- Grant access to the source database for the created users
GRANT ALL PRIVILEGES ON source.* TO 'techSource'@'%';

-- FLUSH PRIVILEGES is needed after creating or modifying users
FLUSH PRIVILEGES;