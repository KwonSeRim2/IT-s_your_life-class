import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

// add
import VueLazyload from 'vue-lazyload'

const app = createApp(App)

app.use(router)

// add
app.use(VueLazyload)

app.mount('#app')
