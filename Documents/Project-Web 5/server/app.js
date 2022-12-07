const express= require('express');
const app = express();
const mongoose=require('mongoose');
const PORT=8080;




mongoose.connect('mongodb://localhost:27017/Finaldb',{
    useNewUrlParser:true,
    useUnifiedTopology:true
});
//changed !!!!  build in our way NOT atlas !!!!! 
//Create a Finaldb in Mongoose pls

mongoose.connection.on('connected',()=>{
    console.log("connected")
});
require('./models/user');
require('./models/post');
app.use(express.json());
app.use(require('./routes/auth'));
app.use(require('./routes/post'));
app.use(require('./routes/user'));


app.listen(PORT,()=>{
    console.log("server is running on",PORT)
})