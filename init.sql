-- Create Users and set passwords
CREATE USER 'techSource'@'%' IDENTIFIED BY 'techSource';

-- Grant access to the source database for the created Users
GRANT ALL PRIVILEGES ON source.* TO 'techSource'@'%';

-- FLUSH PRIVILEGES is needed after creating or modifying Users
FLUSH PRIVILEGES;