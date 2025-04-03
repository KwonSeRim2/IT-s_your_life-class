import Home from '@/pages/Home.vue';
import Studies from '@/pages/Studies.vue';
import Study from '@/pages/Study.vue';
import { createRouter, createWebHistory } from 'vue-router';
//import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'homw',
      component: Home,
    },
    {
      path: '/sudies',
      name: 'sudies',
      component: Studies,
    },
    {
      path: '/sudies/:id',
      name: 'sudies',
      component: Study,
    },
  ],
});

export default router;
