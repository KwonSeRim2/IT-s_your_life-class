import { createRouter, createWebHistory } from 'vue-router';
//import HomeView from '../views/HomeView.vue';
import MovieDetail from '../components/MovieDetail.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    // {
    //   path: '/',
    //   name: 'home',
    //   component: HomeView,
    // },
    {
      path: '/movies/:id',
      name: 'movies/:id',
      component: MovieDetail,
    },
  ],
});

export default router;
