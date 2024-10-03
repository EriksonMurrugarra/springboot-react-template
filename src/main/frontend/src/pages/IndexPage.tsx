import { useState } from 'react';
import axios from 'axios';

function IndexPage() {
  const [message, setMessage] = useState('');

  const handleClick = async () => {
    try {
      const response = await axios.get('/v1/hello');
      setMessage(response.data.message);
    } catch (error) {
      console.error(error);
    }
  };

  return (
    <div>
       <a href="/about">Go to about page</a> <br/>
       <h1>Click To get the message from spring boot server</h1>
      <button onClick={handleClick}>Get Message</button><br/>
      <label>{message}</label>
    </div>
  );
}

export default IndexPage;