const dotenv = require('dotenv');
const express = require('express');
const app = express();

dotenv.config({ path: './config.env' })

require('./db/conn');

//MongoDB
const PORT = process.env.PORT;

//Middleware
const middleware = (req, res, next) => {
    console.log('Middlware');
    next();
}

app.get('/', (req, res) =>{
    res.send(`Homepage`);
})

app.get('/about', middleware, (req, res) =>{
    res.send(`Aboutpage`);
})

app.get('/contact', (req, res) =>{
    res.send(`Contactpage`);
})

app.get('/login', (req, res) =>{
    res.send(`loginpage`);
})

app.get('/signin', (req, res) =>{
    res.send(`signinpage`);
})

app.get('/signup', (req, res) =>{
    res.send(`signuppage`);
})

app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
})