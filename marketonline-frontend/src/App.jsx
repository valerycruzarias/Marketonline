import React from 'react';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Registro from "./pages/Registro";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/registro" element={<Registro />} />
      </Routes>
    </Router>
  );
}

export default App;
